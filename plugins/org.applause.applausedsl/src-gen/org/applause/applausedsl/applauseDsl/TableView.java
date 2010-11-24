/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.TableView#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView()
 * @model
 * @generated
 */
public interface TableView extends SectionedView
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.applausedsl.applauseDsl.TableViewStyle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @see #setStyle(TableViewStyle)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getTableView_Style()
   * @model
   * @generated
   */
  TableViewStyle getStyle();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.TableView#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.TableViewStyle
   * @see #getStyle()
   * @generated
   */
  void setStyle(TableViewStyle value);

} // TableView
