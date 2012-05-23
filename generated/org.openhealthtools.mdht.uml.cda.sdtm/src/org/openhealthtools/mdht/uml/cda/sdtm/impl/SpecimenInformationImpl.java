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

import org.openhealthtools.mdht.uml.cda.impl.ProcedureImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.SpecimenInformationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpecimenInformationImpl extends ProcedureImpl implements SpecimenInformation
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecimenInformationImpl()
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
    return SdtmPackage.Literals.SPECIMEN_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationTargetSiteCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationParticipatingSpecimen(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationParticipatingSpecimen(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationConditionAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationConditionAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationEventStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationEventStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationTimingReference(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationTimingReference(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationparticipatingSpecimenTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationSpecimenCondition(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationSpecimenCondition(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionCodePSpecimenInformationconditionAssociationspecimenConditionCodeP1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCodePSpecimenInformationconditionAssociationspecimenConditionCodeP1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionCodeSpecimenInformationconditionAssociationspecimenConditionCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCodeSpecimenInformationconditionAssociationspecimenConditionCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionMoodCodeSpecimenInformationconditionAssociationspecimenConditionMoodCode1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionMoodCodeSpecimenInformationconditionAssociationspecimenConditionMoodCode1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSpecimenInformationconditionAssociationspecimenConditionValueSpecimenInformationconditionAssociationspecimenConditionValue1(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionValueSpecimenInformationconditionAssociationspecimenConditionValue1(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventStudyDay getEventStudyDay()
  {
    return SpecimenInformationOperations.getEventStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference getTimingReference()
  {
    return SpecimenInformationOperations.getTimingReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation init() {
    	CDAUtil.init(this);
    	return this;
  }
} //SpecimenInformationImpl
