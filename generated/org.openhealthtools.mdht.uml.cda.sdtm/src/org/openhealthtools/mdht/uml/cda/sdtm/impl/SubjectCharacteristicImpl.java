/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

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
  public boolean validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(this, diagnostics, context);
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
    	CDAUtil.init(this);
    	return this;
  }
} //SubjectCharacteristicImpl
