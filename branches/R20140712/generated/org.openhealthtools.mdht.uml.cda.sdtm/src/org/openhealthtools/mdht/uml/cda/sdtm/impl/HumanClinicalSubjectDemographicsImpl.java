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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalSubjectDemographicsOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Clinical Subject Demographics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HumanClinicalSubjectDemographicsImpl extends OrganizerImpl implements HumanClinicalSubjectDemographics
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalSubjectDemographicsImpl()
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
    return SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsStudyArm(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsStudyArm(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsParticipant(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsParticipant(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return HumanClinicalSubjectDemographicsOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StudyArm> getStudyArms()
  {
    return HumanClinicalSubjectDemographicsOperations.getStudyArms(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalSubjectDemographics init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanClinicalSubjectDemographics init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HumanClinicalSubjectDemographicsImpl
