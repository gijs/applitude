package org.applause.applausedsl.scoping;

import org.applause.applausedsl.applauseDsl.ApplauseDslFactory;
import org.applause.applausedsl.applauseDsl.CollectionIterator;
import org.applause.applausedsl.applauseDsl.CollectionLiteral;
import org.applause.applausedsl.applauseDsl.ObjectReference;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.applause.applausedsl.applauseDsl.Property;
import org.applause.applausedsl.applauseDsl.Type;
import org.applause.applausedsl.applauseDsl.TypeDescription;
import org.applause.applausedsl.applauseDsl.VariableDeclaration;
import org.applause.applausedsl.applauseDsl.util.ApplauseDslSwitch;
import org.eclipse.emf.ecore.EObject;

public class TypeUtil {
	
//	public class TypeDesc {
//		private final Type type;
//		private final boolean many;
//		
//		public TypeDesc(Type type, boolean many) {
//			this.type = type;
//			this.many = many;
//		}
//		
//		public Type getType() {
//			return type;
//		}
//		public boolean isMany() {
//			return many;
//		}
//	}

	public static ApplauseDslSwitch<TypeDescription> typeOf = new ApplauseDslSwitch<TypeDescription>() {
		public TypeDescription caseProperty(Property object) {
			return object.getDescription();
		};
		
		public TypeDescription caseVariableDeclaration(VariableDeclaration object) {
			return null;
		};

		public TypeDescription caseParameter(Parameter object) {
			return object.getDescription();
		};

		public TypeDescription caseCollectionIterator(CollectionIterator object) {
			return doGetTypeOf(object.getCollection());
		};

		public TypeDescription caseObjectReference(ObjectReference object) {
			while (object.getTail() != null)
				object = object.getTail();

			return doGetTypeOf(object.getObject());
		};
		
		public TypeDescription caseCollectionLiteral(CollectionLiteral object) {
			TypeDescription result = ApplauseDslFactory.eINSTANCE.createTypeDescription();
			result.setMany(true);
			Type type = doGetTypeOf(object.getItems().get(0)).getType();
			result.setType(type);
			return result;
		};
		
	};
	
	private static TypeDescription doGetTypeOf(EObject object) {
//		System.out.println("doGetTypeOf: " + object.eClass().getName());
		TypeDescription result = typeOf.doSwitch(object);
		if(result == null) {
			typeOf.doSwitch(object);
		}
		return result;
	}
	
	public static TypeDescription getTypeOf(VariableDeclaration declaration) {
		return doGetTypeOf(declaration);
	}
	
	public static String hello(String test) {
		return "";
	}

}
