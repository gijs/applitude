/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslFactory
 * @model kind="package"
 * @generated
 */
public interface ApplauseDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "applauseDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.applause.org/applausedsl/ApplauseDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "applauseDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApplauseDslPackage eINSTANCE = org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ModelImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ModelElementImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.VariableDeclarationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeDescriptionImpl <em>Type Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TypeDescriptionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTypeDescription()
   * @generated
   */
  int TYPE_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION__MANY = 1;

  /**
   * The number of structural features of the '<em>Type Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DESCRIPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ParameterImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DESCRIPTION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ExpressionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 6;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getObjectReference()
   * @generated
   */
  int OBJECT_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE__TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getScalarExpression()
   * @generated
   */
  int SCALAR_EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Scalar Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionExpression()
   * @generated
   */
  int COLLECTION_EXPRESSION = 8;

  /**
   * The number of structural features of the '<em>Collection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringFunction()
   * @generated
   */
  int STRING_FUNCTION = 10;

  /**
   * The number of structural features of the '<em>String Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionLiteral()
   * @generated
   */
  int COLLECTION_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL__ITEMS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionFunction()
   * @generated
   */
  int COLLECTION_FUNCTION = 12;

  /**
   * The number of structural features of the '<em>Collection Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ApplicationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__BACKGROUND = 1;

  /**
   * The feature id for the '<em><b>Start View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__START_VIEW = 2;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TypeImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = MODEL_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Platform Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE__PLATFORM_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.EntityImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Runtime Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__RUNTIME_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXTENDS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.PropertyImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DERIVED = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProvider()
   * @generated
   */
  int CONTENT_PROVIDER = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__PARAMETER = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Storing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__STORING = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__TYPE = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__MANY = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Implementation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__IMPLEMENTATION = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl <em>Content Provider Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProviderImplementation()
   * @generated
   */
  int CONTENT_PROVIDER_IMPLEMENTATION = 19;

  /**
   * The number of structural features of the '<em>Content Provider Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.FetchingContentProviderImplementationImpl <em>Fetching Content Provider Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.FetchingContentProviderImplementationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getFetchingContentProviderImplementation()
   * @generated
   */
  int FETCHING_CONTENT_PROVIDER_IMPLEMENTATION = 20;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fetching Content Provider Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHING_CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl <em>Custom Content Provider Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomContentProviderImplementation()
   * @generated
   */
  int CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION = 21;

  /**
   * The feature id for the '<em><b>Provider Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Content Provider Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT = CONTENT_PROVIDER_IMPLEMENTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ProviderConstructionImpl <em>Provider Construction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ProviderConstructionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProviderConstruction()
   * @generated
   */
  int PROVIDER_CONSTRUCTION = 22;

  /**
   * The number of structural features of the '<em>Provider Construction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDER_CONSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getView()
   * @generated
   */
  int VIEW = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__CONTENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TabViewImpl <em>Tab View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TabViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTabView()
   * @generated
   */
  int TAB_VIEW = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW__CONTENT = VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW__TABS = VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tab View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TabImpl <em>Tab</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TabImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTab()
   * @generated
   */
  int TAB = 25;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__TITLE = 0;

  /**
   * The feature id for the '<em><b>Icon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__ICON = 1;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__VIEW = 2;

  /**
   * The number of structural features of the '<em>Tab</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.SectionedViewImpl <em>Sectioned View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.SectionedViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSectionedView()
   * @generated
   */
  int SECTIONED_VIEW = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__CONTENT = VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__TITLE = VIEW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW__SECTIONS = VIEW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sectioned View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTIONED_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.TableViewImpl <em>Table View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.TableViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableView()
   * @generated
   */
  int TABLE_VIEW = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__NAME = SECTIONED_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__CONTENT = SECTIONED_VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__TITLE = SECTIONED_VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__SECTIONS = SECTIONED_VIEW__SECTIONS;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW__STYLE = SECTIONED_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Table View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_VIEW_FEATURE_COUNT = SECTIONED_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.DetailsViewImpl <em>Details View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.DetailsViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getDetailsView()
   * @generated
   */
  int DETAILS_VIEW = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__NAME = SECTIONED_VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__CONTENT = SECTIONED_VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__TITLE = SECTIONED_VIEW__TITLE;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__SECTIONS = SECTIONED_VIEW__SECTIONS;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW__HEADER = SECTIONED_VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Details View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAILS_VIEW_FEATURE_COUNT = SECTIONED_VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CustomViewImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomView()
   * @generated
   */
  int CUSTOM_VIEW = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__NAME = VIEW__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__CONTENT = VIEW__CONTENT;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW__CLASS_NAME = VIEW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewHeaderImpl <em>View Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewHeaderImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewHeader()
   * @generated
   */
  int VIEW_HEADER = 30;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__TITLE = 0;

  /**
   * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__SUBTITLE = 1;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__DETAILS = 2;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER__IMAGE = 3;

  /**
   * The number of structural features of the '<em>View Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_HEADER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewSectionImpl <em>View Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewSectionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewSection()
   * @generated
   */
  int VIEW_SECTION = 31;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION__TITLE = 0;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION__CELLS = 1;

  /**
   * The number of structural features of the '<em>View Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.SectionCellImpl <em>Section Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.SectionCellImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSectionCell()
   * @generated
   */
  int SECTION_CELL = 32;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__ITERATOR = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__TEXT = 2;

  /**
   * The feature id for the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__DETAILS = 3;

  /**
   * The feature id for the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__IMAGE = 4;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__ACTION = 5;

  /**
   * The feature id for the '<em><b>Accessory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL__ACCESSORY = 6;

  /**
   * The number of structural features of the '<em>Section Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_CELL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionIterator()
   * @generated
   */
  int COLLECTION_ITERATOR = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__NAME = VARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR__COLLECTION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Iterator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_ITERATOR_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewActionImpl <em>View Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewActionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewAction()
   * @generated
   */
  int VIEW_ACTION = 34;

  /**
   * The number of structural features of the '<em>View Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ExternalOpenImpl <em>External Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ExternalOpenImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getExternalOpen()
   * @generated
   */
  int EXTERNAL_OPEN = 35;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OPEN__URL = VIEW_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_OPEN_FEATURE_COUNT = VIEW_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewCallImpl <em>View Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ViewCallImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewCall()
   * @generated
   */
  int VIEW_CALL = 36;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__VIEW = VIEW_ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL__PROVIDER = VIEW_ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>View Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_CALL_FEATURE_COUNT = VIEW_ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl <em>Project Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProjectClass()
   * @generated
   */
  int PROJECT_CLASS = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_CLASS__NAME = 0;

  /**
   * The number of structural features of the '<em>Project Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringConcatImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringConcat()
   * @generated
   */
  int STRING_CONCAT = 38;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT__VALUES = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONCAT_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringReplace()
   * @generated
   */
  int STRING_REPLACE = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__MATCH = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE__REPLACEMENT = STRING_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Replace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REPLACE_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringUrlConform()
   * @generated
   */
  int STRING_URL_CONFORM = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM__VALUE = STRING_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Url Conform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_URL_CONFORM_FEATURE_COUNT = STRING_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.StringSplitImpl <em>String Split</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.StringSplitImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringSplit()
   * @generated
   */
  int STRING_SPLIT = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__VALUE = COLLECTION_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT__DELIMITER = COLLECTION_FUNCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Split</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_SPLIT_FEATURE_COUNT = COLLECTION_FUNCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.ComplexProviderConstructionImpl <em>Complex Provider Construction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.ComplexProviderConstructionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getComplexProviderConstruction()
   * @generated
   */
  int COMPLEX_PROVIDER_CONSTRUCTION = 42;

  /**
   * The feature id for the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Complex Provider Construction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROVIDER_CONSTRUCTION_FEATURE_COUNT = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.impl.SimpleProviderConstructionImpl <em>Simple Provider Construction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.impl.SimpleProviderConstructionImpl
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleProviderConstruction()
   * @generated
   */
  int SIMPLE_PROVIDER_CONSTRUCTION = 43;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Provider Construction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PROVIDER_CONSTRUCTION_FEATURE_COUNT = PROVIDER_CONSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.SerializationFormat <em>Serialization Format</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.SerializationFormat
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSerializationFormat()
   * @generated
   */
  int SERIALIZATION_FORMAT = 44;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.TableViewStyle <em>Table View Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableViewStyle()
   * @generated
   */
  int TABLE_VIEW_STYLE = 45;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.CellType <em>Cell Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellType()
   * @generated
   */
  int CELL_TYPE = 46;

  /**
   * The meta object id for the '{@link org.applause.applausedsl.applauseDsl.CellAccessory <em>Cell Accessory</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.applause.applausedsl.applauseDsl.CellAccessory
   * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellAccessory()
   * @generated
   */
  int CELL_ACCESSORY = 47;


  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.applause.applausedsl.applauseDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Model#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application</em>'.
   * @see org.applause.applausedsl.applauseDsl.Model#getApplication()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Application();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.applause.applausedsl.applauseDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see org.applause.applausedsl.applauseDsl.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ModelElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.ModelElement#getName()
   * @see #getModelElement()
   * @generated
   */
  EAttribute getModelElement_Name();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.applause.applausedsl.applauseDsl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.TypeDescription <em>Type Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Description</em>'.
   * @see org.applause.applausedsl.applauseDsl.TypeDescription
   * @generated
   */
  EClass getTypeDescription();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.TypeDescription#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.TypeDescription#getType()
   * @see #getTypeDescription()
   * @generated
   */
  EReference getTypeDescription_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.TypeDescription#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.applause.applausedsl.applauseDsl.TypeDescription#isMany()
   * @see #getTypeDescription()
   * @generated
   */
  EAttribute getTypeDescription_Many();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.applause.applausedsl.applauseDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Parameter#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.applause.applausedsl.applauseDsl.Parameter#getDescription()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Description();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ObjectReference <em>Object Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Reference</em>'.
   * @see org.applause.applausedsl.applauseDsl.ObjectReference
   * @generated
   */
  EClass getObjectReference();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.ObjectReference#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see org.applause.applausedsl.applauseDsl.ObjectReference#getObject()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Object();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ObjectReference#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail</em>'.
   * @see org.applause.applausedsl.applauseDsl.ObjectReference#getTail()
   * @see #getObjectReference()
   * @generated
   */
  EReference getObjectReference_Tail();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.applause.applausedsl.applauseDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ScalarExpression <em>Scalar Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Expression</em>'.
   * @see org.applause.applausedsl.applauseDsl.ScalarExpression
   * @generated
   */
  EClass getScalarExpression();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionExpression <em>Collection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Expression</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionExpression
   * @generated
   */
  EClass getCollectionExpression();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringFunction <em>String Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Function</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringFunction
   * @generated
   */
  EClass getStringFunction();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionLiteral <em>Collection Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Literal</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionLiteral
   * @generated
   */
  EClass getCollectionLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.CollectionLiteral#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionLiteral#getItems()
   * @see #getCollectionLiteral()
   * @generated
   */
  EReference getCollectionLiteral_Items();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionFunction <em>Collection Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Function</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionFunction
   * @generated
   */
  EClass getCollectionFunction();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Application#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application#getBackground()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Background();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Application#getStartView <em>Start View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start View</em>'.
   * @see org.applause.applausedsl.applauseDsl.Application#getStartView()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_StartView();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.SimpleType#getPlatformType <em>Platform Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.SimpleType#getPlatformType()
   * @see #getSimpleType()
   * @generated
   */
  EAttribute getSimpleType_PlatformType();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Entity#isRuntimeType <em>Runtime Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runtime Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity#isRuntimeType()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_RuntimeType();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.Entity#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity#getExtends()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.applause.applausedsl.applauseDsl.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.applause.applausedsl.applauseDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.Property#isDerived <em>Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Derived</em>'.
   * @see org.applause.applausedsl.applauseDsl.Property#isDerived()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Derived();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.applause.applausedsl.applauseDsl.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Description();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider
   * @generated
   */
  EClass getContentProvider();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#getParameter()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Parameter();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ContentProvider#isStoring <em>Storing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Storing</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#isStoring()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Storing();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#getType()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Type();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ContentProvider#isMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#isMany()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Many();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getImplementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProvider#getImplementation()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Implementation();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ContentProviderImplementation <em>Content Provider Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.ContentProviderImplementation
   * @generated
   */
  EClass getContentProviderImplementation();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation <em>Fetching Content Provider Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fetching Content Provider Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation
   * @generated
   */
  EClass getFetchingContentProviderImplementation();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getFormat()
   * @see #getFetchingContentProviderImplementation()
   * @generated
   */
  EAttribute getFetchingContentProviderImplementation_Format();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getUrl()
   * @see #getFetchingContentProviderImplementation()
   * @generated
   */
  EReference getFetchingContentProviderImplementation_Url();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selection</em>'.
   * @see org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getSelection()
   * @see #getFetchingContentProviderImplementation()
   * @generated
   */
  EReference getFetchingContentProviderImplementation_Selection();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation <em>Custom Content Provider Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Content Provider Implementation</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation
   * @generated
   */
  EClass getCustomContentProviderImplementation();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation#getProviderClass <em>Provider Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provider Class</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation#getProviderClass()
   * @see #getCustomContentProviderImplementation()
   * @generated
   */
  EReference getCustomContentProviderImplementation_ProviderClass();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ProviderConstruction <em>Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provider Construction</em>'.
   * @see org.applause.applausedsl.applauseDsl.ProviderConstruction
   * @generated
   */
  EClass getProviderConstruction();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see org.applause.applausedsl.applauseDsl.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.View#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.applause.applausedsl.applauseDsl.View#getContent()
   * @see #getView()
   * @generated
   */
  EReference getView_Content();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.TabView <em>Tab View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab View</em>'.
   * @see org.applause.applausedsl.applauseDsl.TabView
   * @generated
   */
  EClass getTabView();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.TabView#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see org.applause.applausedsl.applauseDsl.TabView#getTabs()
   * @see #getTabView()
   * @generated
   */
  EReference getTabView_Tabs();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.Tab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab
   * @generated
   */
  EClass getTab();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Tab#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab#getTitle()
   * @see #getTab()
   * @generated
   */
  EReference getTab_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Tab#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Icon</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab#getIcon()
   * @see #getTab()
   * @generated
   */
  EReference getTab_Icon();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.Tab#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see org.applause.applausedsl.applauseDsl.Tab#getView()
   * @see #getTab()
   * @generated
   */
  EReference getTab_View();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.SectionedView <em>Sectioned View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sectioned View</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionedView
   * @generated
   */
  EClass getSectionedView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.SectionedView#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionedView#getTitle()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.SectionedView#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionedView#getSections()
   * @see #getSectionedView()
   * @generated
   */
  EReference getSectionedView_Sections();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.TableView <em>Table View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table View</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView
   * @generated
   */
  EClass getTableView();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.TableView#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableView#getStyle()
   * @see #getTableView()
   * @generated
   */
  EAttribute getTableView_Style();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.DetailsView <em>Details View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Details View</em>'.
   * @see org.applause.applausedsl.applauseDsl.DetailsView
   * @generated
   */
  EClass getDetailsView();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.DetailsView#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see org.applause.applausedsl.applauseDsl.DetailsView#getHeader()
   * @see #getDetailsView()
   * @generated
   */
  EReference getDetailsView_Header();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CustomView <em>Custom View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom View</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomView
   * @generated
   */
  EClass getCustomView();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.CustomView#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.CustomView#getClassName()
   * @see #getCustomView()
   * @generated
   */
  EAttribute getCustomView_ClassName();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ViewHeader <em>View Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Header</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewHeader
   * @generated
   */
  EClass getViewHeader();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ViewHeader#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewHeader#getTitle()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ViewHeader#getSubtitle <em>Subtitle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtitle</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewHeader#getSubtitle()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Subtitle();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ViewHeader#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewHeader#getDetails()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Details();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ViewHeader#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewHeader#getImage()
   * @see #getViewHeader()
   * @generated
   */
  EReference getViewHeader_Image();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ViewSection <em>View Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Section</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewSection
   * @generated
   */
  EClass getViewSection();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ViewSection#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewSection#getTitle()
   * @see #getViewSection()
   * @generated
   */
  EReference getViewSection_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.ViewSection#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewSection#getCells()
   * @see #getViewSection()
   * @generated
   */
  EReference getViewSection_Cells();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.SectionCell <em>Section Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section Cell</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell
   * @generated
   */
  EClass getSectionCell();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.SectionCell#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell#getType()
   * @see #getSectionCell()
   * @generated
   */
  EAttribute getSectionCell_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.SectionCell#getIterator <em>Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Iterator</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell#getIterator()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Iterator();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.SectionCell#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell#getText()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.SectionCell#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Details</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell#getDetails()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Details();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.SectionCell#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Image</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell#getImage()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Image();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.SectionCell#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell#getAction()
   * @see #getSectionCell()
   * @generated
   */
  EReference getSectionCell_Action();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.SectionCell#getAccessory <em>Accessory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accessory</em>'.
   * @see org.applause.applausedsl.applauseDsl.SectionCell#getAccessory()
   * @see #getSectionCell()
   * @generated
   */
  EAttribute getSectionCell_Accessory();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.CollectionIterator <em>Collection Iterator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Iterator</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionIterator
   * @generated
   */
  EClass getCollectionIterator();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.CollectionIterator#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection</em>'.
   * @see org.applause.applausedsl.applauseDsl.CollectionIterator#getCollection()
   * @see #getCollectionIterator()
   * @generated
   */
  EReference getCollectionIterator_Collection();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ViewAction <em>View Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Action</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewAction
   * @generated
   */
  EClass getViewAction();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ExternalOpen <em>External Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Open</em>'.
   * @see org.applause.applausedsl.applauseDsl.ExternalOpen
   * @generated
   */
  EClass getExternalOpen();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ExternalOpen#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.applause.applausedsl.applauseDsl.ExternalOpen#getUrl()
   * @see #getExternalOpen()
   * @generated
   */
  EReference getExternalOpen_Url();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ViewCall <em>View Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Call</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewCall
   * @generated
   */
  EClass getViewCall();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.ViewCall#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewCall#getView()
   * @see #getViewCall()
   * @generated
   */
  EReference getViewCall_View();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ViewCall#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provider</em>'.
   * @see org.applause.applausedsl.applauseDsl.ViewCall#getProvider()
   * @see #getViewCall()
   * @generated
   */
  EReference getViewCall_Provider();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ProjectClass <em>Project Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Class</em>'.
   * @see org.applause.applausedsl.applauseDsl.ProjectClass
   * @generated
   */
  EClass getProjectClass();

  /**
   * Returns the meta object for the attribute '{@link org.applause.applausedsl.applauseDsl.ProjectClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.applause.applausedsl.applauseDsl.ProjectClass#getName()
   * @see #getProjectClass()
   * @generated
   */
  EAttribute getProjectClass_Name();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringConcat <em>String Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Concat</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringConcat
   * @generated
   */
  EClass getStringConcat();

  /**
   * Returns the meta object for the containment reference list '{@link org.applause.applausedsl.applauseDsl.StringConcat#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringConcat#getValues()
   * @see #getStringConcat()
   * @generated
   */
  EReference getStringConcat_Values();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringReplace <em>String Replace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Replace</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace
   * @generated
   */
  EClass getStringReplace();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringReplace#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace#getValue()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringReplace#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace#getMatch()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Match();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringReplace#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringReplace#getReplacement()
   * @see #getStringReplace()
   * @generated
   */
  EReference getStringReplace_Replacement();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringUrlConform <em>String Url Conform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Url Conform</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringUrlConform
   * @generated
   */
  EClass getStringUrlConform();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringUrlConform#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringUrlConform#getValue()
   * @see #getStringUrlConform()
   * @generated
   */
  EReference getStringUrlConform_Value();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.StringSplit <em>String Split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Split</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringSplit
   * @generated
   */
  EClass getStringSplit();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringSplit#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringSplit#getValue()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.StringSplit#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delimiter</em>'.
   * @see org.applause.applausedsl.applauseDsl.StringSplit#getDelimiter()
   * @see #getStringSplit()
   * @generated
   */
  EReference getStringSplit_Delimiter();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.ComplexProviderConstruction <em>Complex Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Provider Construction</em>'.
   * @see org.applause.applausedsl.applauseDsl.ComplexProviderConstruction
   * @generated
   */
  EClass getComplexProviderConstruction();

  /**
   * Returns the meta object for the reference '{@link org.applause.applausedsl.applauseDsl.ComplexProviderConstruction#getProvider <em>Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provider</em>'.
   * @see org.applause.applausedsl.applauseDsl.ComplexProviderConstruction#getProvider()
   * @see #getComplexProviderConstruction()
   * @generated
   */
  EReference getComplexProviderConstruction_Provider();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.ComplexProviderConstruction#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see org.applause.applausedsl.applauseDsl.ComplexProviderConstruction#getArgument()
   * @see #getComplexProviderConstruction()
   * @generated
   */
  EReference getComplexProviderConstruction_Argument();

  /**
   * Returns the meta object for class '{@link org.applause.applausedsl.applauseDsl.SimpleProviderConstruction <em>Simple Provider Construction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Provider Construction</em>'.
   * @see org.applause.applausedsl.applauseDsl.SimpleProviderConstruction
   * @generated
   */
  EClass getSimpleProviderConstruction();

  /**
   * Returns the meta object for the containment reference '{@link org.applause.applausedsl.applauseDsl.SimpleProviderConstruction#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.applause.applausedsl.applauseDsl.SimpleProviderConstruction#getExpression()
   * @see #getSimpleProviderConstruction()
   * @generated
   */
  EReference getSimpleProviderConstruction_Expression();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.SerializationFormat <em>Serialization Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Serialization Format</em>'.
   * @see org.applause.applausedsl.applauseDsl.SerializationFormat
   * @generated
   */
  EEnum getSerializationFormat();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.TableViewStyle <em>Table View Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Table View Style</em>'.
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @generated
   */
  EEnum getTableViewStyle();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.CellType <em>Cell Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cell Type</em>'.
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @generated
   */
  EEnum getCellType();

  /**
   * Returns the meta object for enum '{@link org.applause.applausedsl.applauseDsl.CellAccessory <em>Cell Accessory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cell Accessory</em>'.
   * @see org.applause.applausedsl.applauseDsl.CellAccessory
   * @generated
   */
  EEnum getCellAccessory();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApplauseDslFactory getApplauseDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ModelImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__APPLICATION = eINSTANCE.getModel_Application();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ModelElementImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.VariableDeclarationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeDescriptionImpl <em>Type Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TypeDescriptionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTypeDescription()
     * @generated
     */
    EClass TYPE_DESCRIPTION = eINSTANCE.getTypeDescription();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DESCRIPTION__TYPE = eINSTANCE.getTypeDescription_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DESCRIPTION__MANY = eINSTANCE.getTypeDescription_Many();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ParameterImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl <em>Object Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ObjectReferenceImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getObjectReference()
     * @generated
     */
    EClass OBJECT_REFERENCE = eINSTANCE.getObjectReference();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__OBJECT = eINSTANCE.getObjectReference_Object();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_REFERENCE__TAIL = eINSTANCE.getObjectReference_Tail();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ExpressionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl <em>Scalar Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ScalarExpressionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getScalarExpression()
     * @generated
     */
    EClass SCALAR_EXPRESSION = eINSTANCE.getScalarExpression();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionExpressionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionExpression()
     * @generated
     */
    EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringLiteralImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl <em>String Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringFunctionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringFunction()
     * @generated
     */
    EClass STRING_FUNCTION = eINSTANCE.getStringFunction();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl <em>Collection Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionLiteralImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionLiteral()
     * @generated
     */
    EClass COLLECTION_LITERAL = eINSTANCE.getCollectionLiteral();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_LITERAL__ITEMS = eINSTANCE.getCollectionLiteral_Items();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl <em>Collection Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionFunctionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionFunction()
     * @generated
     */
    EClass COLLECTION_FUNCTION = eINSTANCE.getCollectionFunction();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ApplicationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__BACKGROUND = eINSTANCE.getApplication_Background();

    /**
     * The meta object literal for the '<em><b>Start View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__START_VIEW = eINSTANCE.getApplication_StartView();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TypeImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.SimpleTypeImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE__PLATFORM_TYPE = eINSTANCE.getSimpleType_PlatformType();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.EntityImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Runtime Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__RUNTIME_TYPE = eINSTANCE.getEntity_RuntimeType();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__EXTENDS = eINSTANCE.getEntity_Extends();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.PropertyImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DERIVED = eINSTANCE.getProperty_Derived();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl <em>Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProvider()
     * @generated
     */
    EClass CONTENT_PROVIDER = eINSTANCE.getContentProvider();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__PARAMETER = eINSTANCE.getContentProvider_Parameter();

    /**
     * The meta object literal for the '<em><b>Storing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__STORING = eINSTANCE.getContentProvider_Storing();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__TYPE = eINSTANCE.getContentProvider_Type();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__MANY = eINSTANCE.getContentProvider_Many();

    /**
     * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__IMPLEMENTATION = eINSTANCE.getContentProvider_Implementation();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl <em>Content Provider Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ContentProviderImplementationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getContentProviderImplementation()
     * @generated
     */
    EClass CONTENT_PROVIDER_IMPLEMENTATION = eINSTANCE.getContentProviderImplementation();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.FetchingContentProviderImplementationImpl <em>Fetching Content Provider Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.FetchingContentProviderImplementationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getFetchingContentProviderImplementation()
     * @generated
     */
    EClass FETCHING_CONTENT_PROVIDER_IMPLEMENTATION = eINSTANCE.getFetchingContentProviderImplementation();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT = eINSTANCE.getFetchingContentProviderImplementation_Format();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL = eINSTANCE.getFetchingContentProviderImplementation_Url();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION = eINSTANCE.getFetchingContentProviderImplementation_Selection();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl <em>Custom Content Provider Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomContentProviderImplementation()
     * @generated
     */
    EClass CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION = eINSTANCE.getCustomContentProviderImplementation();

    /**
     * The meta object literal for the '<em><b>Provider Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS = eINSTANCE.getCustomContentProviderImplementation_ProviderClass();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ProviderConstructionImpl <em>Provider Construction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ProviderConstructionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProviderConstruction()
     * @generated
     */
    EClass PROVIDER_CONSTRUCTION = eINSTANCE.getProviderConstruction();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__CONTENT = eINSTANCE.getView_Content();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TabViewImpl <em>Tab View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TabViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTabView()
     * @generated
     */
    EClass TAB_VIEW = eINSTANCE.getTabView();

    /**
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_VIEW__TABS = eINSTANCE.getTabView_Tabs();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TabImpl <em>Tab</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TabImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTab()
     * @generated
     */
    EClass TAB = eINSTANCE.getTab();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__TITLE = eINSTANCE.getTab_Title();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__ICON = eINSTANCE.getTab_Icon();

    /**
     * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__VIEW = eINSTANCE.getTab_View();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.SectionedViewImpl <em>Sectioned View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.SectionedViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSectionedView()
     * @generated
     */
    EClass SECTIONED_VIEW = eINSTANCE.getSectionedView();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__TITLE = eINSTANCE.getSectionedView_Title();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTIONED_VIEW__SECTIONS = eINSTANCE.getSectionedView_Sections();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.TableViewImpl <em>Table View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.TableViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableView()
     * @generated
     */
    EClass TABLE_VIEW = eINSTANCE.getTableView();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_VIEW__STYLE = eINSTANCE.getTableView_Style();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.DetailsViewImpl <em>Details View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.DetailsViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getDetailsView()
     * @generated
     */
    EClass DETAILS_VIEW = eINSTANCE.getDetailsView();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETAILS_VIEW__HEADER = eINSTANCE.getDetailsView_Header();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CustomViewImpl <em>Custom View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CustomViewImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCustomView()
     * @generated
     */
    EClass CUSTOM_VIEW = eINSTANCE.getCustomView();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_VIEW__CLASS_NAME = eINSTANCE.getCustomView_ClassName();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewHeaderImpl <em>View Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewHeaderImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewHeader()
     * @generated
     */
    EClass VIEW_HEADER = eINSTANCE.getViewHeader();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__TITLE = eINSTANCE.getViewHeader_Title();

    /**
     * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__SUBTITLE = eINSTANCE.getViewHeader_Subtitle();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__DETAILS = eINSTANCE.getViewHeader_Details();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_HEADER__IMAGE = eINSTANCE.getViewHeader_Image();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewSectionImpl <em>View Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewSectionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewSection()
     * @generated
     */
    EClass VIEW_SECTION = eINSTANCE.getViewSection();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_SECTION__TITLE = eINSTANCE.getViewSection_Title();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_SECTION__CELLS = eINSTANCE.getViewSection_Cells();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.SectionCellImpl <em>Section Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.SectionCellImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSectionCell()
     * @generated
     */
    EClass SECTION_CELL = eINSTANCE.getSectionCell();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION_CELL__TYPE = eINSTANCE.getSectionCell_Type();

    /**
     * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__ITERATOR = eINSTANCE.getSectionCell_Iterator();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__TEXT = eINSTANCE.getSectionCell_Text();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__DETAILS = eINSTANCE.getSectionCell_Details();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__IMAGE = eINSTANCE.getSectionCell_Image();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION_CELL__ACTION = eINSTANCE.getSectionCell_Action();

    /**
     * The meta object literal for the '<em><b>Accessory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION_CELL__ACCESSORY = eINSTANCE.getSectionCell_Accessory();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl <em>Collection Iterator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.CollectionIteratorImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCollectionIterator()
     * @generated
     */
    EClass COLLECTION_ITERATOR = eINSTANCE.getCollectionIterator();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_ITERATOR__COLLECTION = eINSTANCE.getCollectionIterator_Collection();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewActionImpl <em>View Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewActionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewAction()
     * @generated
     */
    EClass VIEW_ACTION = eINSTANCE.getViewAction();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ExternalOpenImpl <em>External Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ExternalOpenImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getExternalOpen()
     * @generated
     */
    EClass EXTERNAL_OPEN = eINSTANCE.getExternalOpen();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_OPEN__URL = eINSTANCE.getExternalOpen_Url();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ViewCallImpl <em>View Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ViewCallImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getViewCall()
     * @generated
     */
    EClass VIEW_CALL = eINSTANCE.getViewCall();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CALL__VIEW = eINSTANCE.getViewCall_View();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW_CALL__PROVIDER = eINSTANCE.getViewCall_Provider();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl <em>Project Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ProjectClassImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getProjectClass()
     * @generated
     */
    EClass PROJECT_CLASS = eINSTANCE.getProjectClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_CLASS__NAME = eINSTANCE.getProjectClass_Name();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringConcatImpl <em>String Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringConcatImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringConcat()
     * @generated
     */
    EClass STRING_CONCAT = eINSTANCE.getStringConcat();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_CONCAT__VALUES = eINSTANCE.getStringConcat_Values();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl <em>String Replace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringReplaceImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringReplace()
     * @generated
     */
    EClass STRING_REPLACE = eINSTANCE.getStringReplace();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__VALUE = eINSTANCE.getStringReplace_Value();

    /**
     * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__MATCH = eINSTANCE.getStringReplace_Match();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_REPLACE__REPLACEMENT = eINSTANCE.getStringReplace_Replacement();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl <em>String Url Conform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringUrlConformImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringUrlConform()
     * @generated
     */
    EClass STRING_URL_CONFORM = eINSTANCE.getStringUrlConform();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_URL_CONFORM__VALUE = eINSTANCE.getStringUrlConform_Value();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.StringSplitImpl <em>String Split</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.StringSplitImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getStringSplit()
     * @generated
     */
    EClass STRING_SPLIT = eINSTANCE.getStringSplit();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__VALUE = eINSTANCE.getStringSplit_Value();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_SPLIT__DELIMITER = eINSTANCE.getStringSplit_Delimiter();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.ComplexProviderConstructionImpl <em>Complex Provider Construction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.ComplexProviderConstructionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getComplexProviderConstruction()
     * @generated
     */
    EClass COMPLEX_PROVIDER_CONSTRUCTION = eINSTANCE.getComplexProviderConstruction();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_PROVIDER_CONSTRUCTION__PROVIDER = eINSTANCE.getComplexProviderConstruction_Provider();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_PROVIDER_CONSTRUCTION__ARGUMENT = eINSTANCE.getComplexProviderConstruction_Argument();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.impl.SimpleProviderConstructionImpl <em>Simple Provider Construction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.impl.SimpleProviderConstructionImpl
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSimpleProviderConstruction()
     * @generated
     */
    EClass SIMPLE_PROVIDER_CONSTRUCTION = eINSTANCE.getSimpleProviderConstruction();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_PROVIDER_CONSTRUCTION__EXPRESSION = eINSTANCE.getSimpleProviderConstruction_Expression();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.SerializationFormat <em>Serialization Format</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.SerializationFormat
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getSerializationFormat()
     * @generated
     */
    EEnum SERIALIZATION_FORMAT = eINSTANCE.getSerializationFormat();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.TableViewStyle <em>Table View Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.TableViewStyle
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getTableViewStyle()
     * @generated
     */
    EEnum TABLE_VIEW_STYLE = eINSTANCE.getTableViewStyle();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.CellType <em>Cell Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.CellType
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellType()
     * @generated
     */
    EEnum CELL_TYPE = eINSTANCE.getCellType();

    /**
     * The meta object literal for the '{@link org.applause.applausedsl.applauseDsl.CellAccessory <em>Cell Accessory</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.applause.applausedsl.applauseDsl.CellAccessory
     * @see org.applause.applausedsl.applauseDsl.impl.ApplauseDslPackageImpl#getCellAccessory()
     * @generated
     */
    EEnum CELL_ACCESSORY = eINSTANCE.getCellAccessory();

  }

} //ApplauseDslPackage
