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

import org.openhealthtools.mdht.uml.cda.sdtm.BaselineIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.DerivedDataIndicator;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicrobiologySpecimenFindingOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microbiology Specimen Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MicrobiologySpecimenFindingImpl extends ObservationImpl implements MicrobiologySpecimenFinding
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MicrobiologySpecimenFindingImpl()
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
    return SdtmPackage.Literals.MICROBIOLOGY_SPECIMEN_FINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingMethodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMethodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingSpecimenInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingSpecimenInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return MicrobiologySpecimenFindingOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return MicrobiologySpecimenFindingOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation getSpecimenInformation()
  {
    return MicrobiologySpecimenFindingOperations.getSpecimenInformation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicrobiologySpecimenFinding init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MicrobiologySpecimenFinding init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MicrobiologySpecimenFindingImpl
