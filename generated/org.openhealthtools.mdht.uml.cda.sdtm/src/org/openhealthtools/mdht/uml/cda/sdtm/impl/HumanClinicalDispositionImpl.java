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

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalDispositionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Disposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HumanClinicalDispositionImpl extends ActImpl implements HumanClinicalDisposition
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalDispositionImpl()
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
    return SdtmPackage.Literals.HUMAN_CLINICAL_DISPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionDispositionCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionDispositionCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionDispositionSubCategoryAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionDispositionSubCategoryAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionStudyEpoch(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionStudyEpoch(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionGroupIdentifier(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionGroupIdentifier(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositionStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositionStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyEpoch getStudyEpoch()
  {
    return HumanClinicalDispositionOperations.getStudyEpoch(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return HumanClinicalDispositionOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier getGroupIdentifier()
  {
    return HumanClinicalDispositionOperations.getGroupIdentifier(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return HumanClinicalDispositionOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalDisposition init() {
    	CDAUtil.init(this);
    	return this;
  }
} //HumanClinicalDispositionImpl
