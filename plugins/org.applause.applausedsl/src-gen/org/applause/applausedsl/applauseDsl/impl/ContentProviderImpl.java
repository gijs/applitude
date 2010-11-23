/**
 * <copyright>
 * </copyright>
 *
 */
package org.applause.applausedsl.applauseDsl.impl;

import org.applause.applausedsl.applauseDsl.ApplauseDslPackage;
import org.applause.applausedsl.applauseDsl.ContentProvider;
import org.applause.applausedsl.applauseDsl.ContentProviderImplementation;
import org.applause.applausedsl.applauseDsl.Parameter;
import org.applause.applausedsl.applauseDsl.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl#isStoring <em>Storing</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.applause.applausedsl.applauseDsl.impl.ContentProviderImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentProviderImpl extends ModelElementImpl implements ContentProvider
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter parameter;

  /**
   * The default value of the '{@link #isStoring() <em>Storing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStoring()
   * @generated
   * @ordered
   */
  protected static final boolean STORING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStoring() <em>Storing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStoring()
   * @generated
   * @ordered
   */
  protected boolean storing = STORING_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected static final boolean MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected boolean many = MANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected ContentProviderImplementation implementation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentProviderImpl()
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
    return ApplauseDslPackage.Literals.CONTENT_PROVIDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs)
  {
    Parameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER, newParameter, newParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStoring()
  {
    return storing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStoring(boolean newStoring)
  {
    boolean oldStoring = storing;
    storing = newStoring;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTENT_PROVIDER__STORING, oldStoring, storing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplauseDslPackage.CONTENT_PROVIDER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTENT_PROVIDER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMany()
  {
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMany(boolean newMany)
  {
    boolean oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTENT_PROVIDER__MANY, oldMany, many));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProviderImplementation getImplementation()
  {
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImplementation(ContentProviderImplementation newImplementation, NotificationChain msgs)
  {
    ContentProviderImplementation oldImplementation = implementation;
    implementation = newImplementation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION, oldImplementation, newImplementation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplementation(ContentProviderImplementation newImplementation)
  {
    if (newImplementation != implementation)
    {
      NotificationChain msgs = null;
      if (implementation != null)
        msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION, null, msgs);
      if (newImplementation != null)
        msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION, null, msgs);
      msgs = basicSetImplementation(newImplementation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION, newImplementation, newImplementation));
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
      case ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER:
        return basicSetParameter(null, msgs);
      case ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION:
        return basicSetImplementation(null, msgs);
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
      case ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER:
        return getParameter();
      case ApplauseDslPackage.CONTENT_PROVIDER__STORING:
        return isStoring();
      case ApplauseDslPackage.CONTENT_PROVIDER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ApplauseDslPackage.CONTENT_PROVIDER__MANY:
        return isMany();
      case ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION:
        return getImplementation();
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
      case ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER:
        setParameter((Parameter)newValue);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__STORING:
        setStoring((Boolean)newValue);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__TYPE:
        setType((Type)newValue);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__MANY:
        setMany((Boolean)newValue);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION:
        setImplementation((ContentProviderImplementation)newValue);
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
      case ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER:
        setParameter((Parameter)null);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__STORING:
        setStoring(STORING_EDEFAULT);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__TYPE:
        setType((Type)null);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__MANY:
        setMany(MANY_EDEFAULT);
        return;
      case ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION:
        setImplementation((ContentProviderImplementation)null);
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
      case ApplauseDslPackage.CONTENT_PROVIDER__PARAMETER:
        return parameter != null;
      case ApplauseDslPackage.CONTENT_PROVIDER__STORING:
        return storing != STORING_EDEFAULT;
      case ApplauseDslPackage.CONTENT_PROVIDER__TYPE:
        return type != null;
      case ApplauseDslPackage.CONTENT_PROVIDER__MANY:
        return many != MANY_EDEFAULT;
      case ApplauseDslPackage.CONTENT_PROVIDER__IMPLEMENTATION:
        return implementation != null;
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
    result.append(" (storing: ");
    result.append(storing);
    result.append(", many: ");
    result.append(many);
    result.append(')');
    return result.toString();
  }

} //ContentProviderImpl
