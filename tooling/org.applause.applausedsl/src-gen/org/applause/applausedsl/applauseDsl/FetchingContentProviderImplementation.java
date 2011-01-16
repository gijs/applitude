/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetching Content Provider Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getFormat <em>Format</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getUrl <em>Url</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getFetchingContentProviderImplementation()
 * @model
 * @generated
 */
public interface FetchingContentProviderImplementation extends ContentProviderImplementation
{
  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * The literals are from the enumeration {@link org.applause.applausedsl.applauseDsl.SerializationFormat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.SerializationFormat
   * @see #setFormat(SerializationFormat)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getFetchingContentProviderImplementation_Format()
   * @model
   * @generated
   */
  SerializationFormat getFormat();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see org.applause.applausedsl.applauseDsl.SerializationFormat
   * @see #getFormat()
   * @generated
   */
  void setFormat(SerializationFormat value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' containment reference.
   * @see #setUrl(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getFetchingContentProviderImplementation_Url()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getUrl();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getUrl <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' containment reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(ScalarExpression value);

  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference.
   * @see #setSelection(ScalarExpression)
   * @see org.applause.applausedsl.applauseDsl.ApplauseDslPackage#getFetchingContentProviderImplementation_Selection()
   * @model containment="true"
   * @generated
   */
  ScalarExpression getSelection();

  /**
   * Sets the value of the '{@link org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation#getSelection <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' containment reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(ScalarExpression value);

} // FetchingContentProviderImplementation
