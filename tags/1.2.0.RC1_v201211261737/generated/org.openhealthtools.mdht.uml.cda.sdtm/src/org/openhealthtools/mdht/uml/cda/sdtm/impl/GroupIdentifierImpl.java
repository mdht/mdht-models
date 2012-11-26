/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.GroupIdentifierOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GroupIdentifierImpl extends ActImpl implements GroupIdentifier
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupIdentifierImpl()
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
    return SdtmPackage.Literals.GROUP_IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupIdentifierTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return GroupIdentifierOperations.validateGroupIdentifierTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupIdentifierClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return GroupIdentifierOperations.validateGroupIdentifierClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupIdentifierCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return GroupIdentifierOperations.validateGroupIdentifierCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupIdentifierCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return GroupIdentifierOperations.validateGroupIdentifierCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupIdentifierId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return GroupIdentifierOperations.validateGroupIdentifierId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGroupIdentifierMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return GroupIdentifierOperations.validateGroupIdentifierMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupIdentifier init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //GroupIdentifierImpl
