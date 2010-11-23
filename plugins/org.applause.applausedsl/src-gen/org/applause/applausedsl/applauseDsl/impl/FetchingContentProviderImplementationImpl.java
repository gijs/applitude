/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl.impl;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.FetchingContentProviderImplementation;
import org.applause.applausedsl.applauseDsl.ScalarExpression;
import org.applause.applausedsl.applauseDsl.SerializationFormat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetching Content Provider Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.FetchingContentProviderImplementationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.FetchingContentProviderImplementationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.FetchingContentProviderImplementationImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetchingContentProviderImplementationImpl extends ContentProviderImplementationImpl implements FetchingContentProviderImplementation
{
  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final SerializationFormat FORMAT_EDEFAULT = SerializationFormat.XML;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected SerializationFormat format = FORMAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected ScalarExpression url;

  /**
   * The cached value of the '{@link #getSelection() <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelection()
   * @generated
   * @ordered
   */
  protected ScalarExpression selection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FetchingContentProviderImplementationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApplauseDslPackage.Literals.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SerializationFormat getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(SerializationFormat newFormat)
  {
    SerializationFormat oldFormat = format;
    format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUrl(ScalarExpression newUrl, NotificationChain msgs)
  {
    ScalarExpression oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL, oldUrl, newUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(ScalarExpression newUrl)
  {
    if (newUrl != url)
    {
      NotificationChain msgs = null;
      if (url != null)
        msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL, null, msgs);
      if (newUrl != null)
        msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL, null, msgs);
      msgs = basicSetUrl(newUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL, newUrl, newUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarExpression getSelection()
  {
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelection(ScalarExpression newSelection, NotificationChain msgs)
  {
    ScalarExpression oldSelection = selection;
    selection = newSelection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION, oldSelection, newSelection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(ScalarExpression newSelection)
  {
    if (newSelection != selection)
    {
      NotificationChain msgs = null;
      if (selection != null)
        msgs = ((InternalEObject)selection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION, null, msgs);
      if (newSelection != null)
        msgs = ((InternalEObject)newSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION, null, msgs);
      msgs = basicSetSelection(newSelection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION, newSelection, newSelection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL:
        return basicSetUrl(null, msgs);
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION:
        return basicSetSelection(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT:
        return getFormat();
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL:
        return getUrl();
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION:
        return getSelection();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT:
        setFormat((SerializationFormat)newValue);
        return;
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL:
        setUrl((ScalarExpression)newValue);
        return;
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION:
        setSelection((ScalarExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL:
        setUrl((ScalarExpression)null);
        return;
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION:
        setSelection((ScalarExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__FORMAT:
        return format != FORMAT_EDEFAULT;
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__URL:
        return url != null;
      case ApplauseDslPackage.FETCHING_CONTENT_PROVIDER_IMPLEMENTATION__SELECTION:
        return selection != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (format: ");
    result.append(format);
    result.append(')');
    return result.toString();
  }

} //FetchingContentProviderImplementationImpl
