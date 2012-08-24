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
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicroscopicFindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microscopic Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MicroscopicFindingImpl extends ObservationImpl implements MicroscopicFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MicroscopicFindingImpl()
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
    return SdtmPackage.Literals.MICROSCOPIC_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingEventSeverity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingEventSeverity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingDeathRelationshipAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingDeathRelationshipAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingMassIdentification(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingMassIdentification(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingBodySystemorOrganClass(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingBodySystemorOrganClass(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return MicroscopicFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return MicroscopicFindingOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity getEventSeverity()
  {
    return MicroscopicFindingOperations.getEventSeverity(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return MicroscopicFindingOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return MicroscopicFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass getBodySystemorOrganClass()
  {
    return MicroscopicFindingOperations.getBodySystemorOrganClass(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicroscopicFinding init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MicroscopicFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MicroscopicFindingImpl
