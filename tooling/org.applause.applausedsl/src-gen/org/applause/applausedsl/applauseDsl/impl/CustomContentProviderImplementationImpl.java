/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl.impl;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.CustomContentProviderImplementation;
import org.applause.applausedsl.applauseDsl.ProjectClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Content Provider Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.CustomContentProviderImplementationImpl#getProviderClass <em>Provider Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomContentProviderImplementationImpl extends ContentProviderImplementationImpl implements CustomContentProviderImplementation
{
  /**
   * The cached value of the '{@link #getProviderClass() <em>Provider Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProviderClass()
   * @generated
   * @ordered
   */
  protected ProjectClass providerClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomContentProviderImplementationImpl()
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
    return ApplauseDslPackage.Literals.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectClass getProviderClass()
  {
    return providerClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProviderClass(ProjectClass newProviderClass, NotificationChain msgs)
  {
    ProjectClass oldProviderClass = providerClass;
    providerClass = newProviderClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS, oldProviderClass, newProviderClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProviderClass(ProjectClass newProviderClass)
  {
    if (newProviderClass != providerClass)
    {
      NotificationChain msgs = null;
      if (providerClass != null)
        msgs = ((InternalEObject)providerClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS, null, msgs);
      if (newProviderClass != null)
        msgs = ((InternalEObject)newProviderClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS, null, msgs);
      msgs = basicSetProviderClass(newProviderClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS, newProviderClass, newProviderClass));
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
      case ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS:
        return basicSetProviderClass(null, msgs);
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
      case ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS:
        return getProviderClass();
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
      case ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS:
        setProviderClass((ProjectClass)newValue);
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
      case ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS:
        setProviderClass((ProjectClass)null);
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
      case ApplauseDslPackage.CUSTOM_CONTENT_PROVIDER_IMPLEMENTATION__PROVIDER_CLASS:
        return providerClass != null;
    }
    return super.eIsSet(featureID);
  }

} //CustomContentProviderImplementationImpl
