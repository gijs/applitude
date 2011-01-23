/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Cell#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Cell#getText <em>Text</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Cell#getDetails <em>Details</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Cell#getImage <em>Image</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Cell#getAction <em>Action</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.Cell#getAccessory <em>Accessory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends ViewContentElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.applausedsl.applauseDsl.CellType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @see #setType(CellType)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCell_Type()
   * @model
   * @generated
   */
  CellType getType();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Cell#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.CellType
   * @see #getType()
   * @generated
   */
  void setType(CellType value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCell_Text()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getText();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Cell#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' containment reference.
   * @see #setDetails(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCell_Details()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getDetails();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Cell#getDetails <em>Details</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' containment reference.
   * @see #getDetails()
   * @generated
   */
  void setDetails(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' containment reference.
   * @see #setImage(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCell_Image()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getImage();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Cell#getImage <em>Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' containment reference.
   * @see #getImage()
   * @generated
   */
  void setImage(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(ViewAction)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCell_Action()
   * @model containment="true"
   * @generated
   */
  ViewAction getAction();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Cell#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ViewAction value);

  /**
   * Returns the value of the '<em><b>Accessory</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.applausedsl.applauseDsl.CellAccessory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accessory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accessory</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.CellAccessory
   * @see #setAccessory(CellAccessory)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getCell_Accessory()
   * @model
   * @generated
   */
  CellAccessory getAccessory();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.Cell#getAccessory <em>Accessory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessory</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.CellAccessory
   * @see #getAccessory()
   * @generated
   */
  void setAccessory(CellAccessory value);

} // Cell
