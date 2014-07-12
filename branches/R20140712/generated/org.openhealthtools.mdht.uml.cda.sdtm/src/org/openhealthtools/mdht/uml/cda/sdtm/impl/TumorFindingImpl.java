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

import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.TumorFindingOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tumor Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TumorFindingImpl extends ObservationImpl implements TumorFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TumorFindingImpl()
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
    return SdtmPackage.Literals.TUMOR_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingMassIdentification(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingMalignancyStatusAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingMalignancyStatusAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingDeathRelationshipAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingDeathRelationshipAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingDetectionDelayAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingDetectionDelayAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingmalignancyStatusAssociationmalignancyStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingmalignancyStatusAssociationmalignancyStatusValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTumorFindingmalignancyStatusAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return TumorFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return TumorFindingOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return TumorFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TumorFinding init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TumorFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //TumorFindingImpl
