/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ContentProvider#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ContentProvider#isStoring <em>Storing</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ContentProvider#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ContentProvider#isMany <em>Many</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.ContentProvider#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getContentProvider()
 * @model
 * @generated
 */
public interface ContentProvider extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getContentProvider_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Storing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storing</em>' attribute.
   * @see #setStoring(boolean)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getContentProvider_Storing()
   * @model
   * @generated
   */
  boolean isStoring();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ContentProvider#isStoring <em>Storing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storing</em>' attribute.
   * @see #isStoring()
   * @generated
   */
  void setStoring(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getContentProvider_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getContentProvider_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ContentProvider#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation</em>' containment reference.
   * @see #setImplementation(ContentProviderImplementation)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getContentProvider_Implementation()
   * @model containment="true"
   * @generated
   */
  ContentProviderImplementation getImplementation();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.ContentProvider#getImplementation <em>Implementation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation</em>' containment reference.
   * @see #getImplementation()
   * @generated
   */
  void setImplementation(ContentProviderImplementation value);

} // ContentProvider
