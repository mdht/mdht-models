/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.Participant2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getMassIdentification()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mass IdentificationTemplateId Mass IdentificationTypeCode Mass IdentificationParticipantRole' templateId.root='2.16.840.1.113883.10.20.23.75' typeCode='SBJ'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmMassIdentificationMassRole classCode='ROL' constraints.validation.error='MassRoleClassCode MassRoleId'"
 * @generated
 */
public interface MassIdentification extends Participant2
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.75\')'"
   * @generated
   */
  boolean validateMassIdentificationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::SBJ'"
   * @generated
   */
  boolean validateMassIdentificationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))'"
   * @generated
   */
  boolean validateMassIdentificationParticipantRole(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MassIdentification init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MassIdentification init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MassIdentification
