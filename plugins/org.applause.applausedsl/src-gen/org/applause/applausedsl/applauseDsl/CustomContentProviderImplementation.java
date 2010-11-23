/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Content Provider Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation#getProviderClass <em>Provider Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCustomContentProviderImplementation()
 * @model
 * @generated
 */
public interface CustomContentProviderImplementation extends ContentProviderImplementation
{
  /**
   * Returns the value of the '<em><b>Provider Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider Class</em>' containment reference.
   * @see #setProviderClass(ProjectClass)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCustomContentProviderImplementation_ProviderClass()
   * @model containment="true"
   * @generated
   */
  ProjectClass getProviderClass();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation#getProviderClass <em>Provider Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider Class</em>' containment reference.
   * @see #getProviderClass()
   * @generated
   */
  void setProviderClass(ProjectClass value);

} // CustomContentProviderImplementation
