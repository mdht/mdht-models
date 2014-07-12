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

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectCharacteristicOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubjectCharacteristicImpl extends ObservationImpl implements SubjectCharacteristic
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubjectCharacteristicImpl()
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
    return SdtmPackage.Literals.SUBJECT_CHARACTERISTIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicSubjectCharateristicSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicSubjectCharateristicSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategory(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategory(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return SubjectCharacteristicOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return SubjectCharacteristicOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return SubjectCharacteristicOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectCharacteristic init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectCharacteristic init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //SubjectCharacteristicImpl
