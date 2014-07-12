/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.InjuryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injury</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InjuryImpl extends OrganizerImpl implements Injury
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InjuryImpl()
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
    return VsdrPackage.Literals.INJURY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationship(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentInjuryInformationInjuryInformation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociationWorkAssociationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociationWorkAssociationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociationWorkAssociationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociationWorkAssociationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociationWorkAssociationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentWorkAssociationWorkAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociationTransportationAssociationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociationTransportationAssociationValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationAssociationTransportationAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjuryComponentTransportationRelationshipTransportationRelationship(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationship(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Injury init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Injury init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //InjuryImpl
