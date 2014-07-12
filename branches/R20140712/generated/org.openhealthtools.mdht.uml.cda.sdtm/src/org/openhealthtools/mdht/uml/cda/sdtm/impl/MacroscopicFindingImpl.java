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
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MacroscopicFindingOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Macroscopic Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MacroscopicFindingImpl extends ObservationImpl implements MacroscopicFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MacroscopicFindingImpl()
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
    return SdtmPackage.Literals.MACROSCOPIC_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingMassIdentification(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingEventSeverity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingEntryRelationship(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMacroscopicFindingDeathRelationshipAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MacroscopicFindingOperations.validateMacroscopicFindingDeathRelationshipAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return MacroscopicFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return MacroscopicFindingOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return MacroscopicFindingOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return MacroscopicFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity getEventSeverity()
  {
    return MacroscopicFindingOperations.getEventSeverity(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return MacroscopicFindingOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroscopicFinding init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MacroscopicFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MacroscopicFindingImpl
