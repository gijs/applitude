/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Application#getBackground <em>Background</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Application#getStartView <em>Start View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' containment reference.
   * @see #setBackground(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getApplication_Background()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getBackground();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Application#getBackground <em>Background</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' containment reference.
   * @see #getBackground()
   * @generated
   */
  void setBackground(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Start View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start View</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start View</em>' containment reference.
   * @see #setStartView(ViewCall)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getApplication_StartView()
   * @model containment="true"
   * @generated
   */
  ViewCall getStartView();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Application#getStartView <em>Start View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start View</em>' containment reference.
   * @see #getStartView()
   * @generated
   */
  void setStartView(ViewCall value);

} // Application
