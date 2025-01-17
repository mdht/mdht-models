/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certifying Death</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage#getCertifyingDeath()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certifying Death'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Certifying DeathTemplateId Certifying DeathClassCode Certifying DeathMoodCode Certifying DeathCode Certifying DeathEffectiveTime Certifying DeathCertificationPerformer' templateId.root='2.16.840.1.113883.10.20.26.1.7' code.code='69437-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Death Certifier'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformer typeCode='PRF' constraints.validation.error='Certifying DeathCertificationPerformerTypeCode Certifying DeathCertificationPerformerCertifierRole Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName Certifying DeathCertificationPerformerCertifierRoleClassCode Certifying DeathCertificationPerformerCertifierRoleId Certifying DeathCertificationPerformerCertifierRoleCode Certifying DeathCertificationPerformerCertifierRoleCodeP Certifying DeathCertificationPerformerCertifierRoleAddr Certifying DeathCertificationPerformerCertifierRoleCertifyingParty' constraints.validation.query='Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName Certifying DeathCertificationPerformerCertifierRoleClassCode Certifying DeathCertificationPerformerCertifierRoleId Certifying DeathCertificationPerformerCertifierRoleCode Certifying DeathCertificationPerformerCertifierRoleCodeP Certifying DeathCertificationPerformerCertifierRoleAddr Certifying DeathCertificationPerformerCertifierRoleCertifyingParty'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRole classCode='ASSIGNED' constraints.validation.error='Certifying DeathCertificationPerformerCertifierRoleClassCode Certifying DeathCertificationPerformerCertifierRoleId Certifying DeathCertificationPerformerCertifierRoleCode Certifying DeathCertificationPerformerCertifierRoleCodeP Certifying DeathCertificationPerformerCertifierRoleAddr Certifying DeathCertificationPerformerCertifierRoleCertifyingParty Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName' code.codeSystem='2.16.840.1.114222.4.5.274' code.codeSystemName='PHIN VS (CDC Local Coding System)' constraints.validation.query='Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsdrCertifyingDeathCertificationPerformerCertifierRoleCertifyingParty classCode='PSN' constraints.validation.error='Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyClassCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode Certifying DeathCertificationPerformerCertifierRoleCertifyingPartyName' determinerCode='INSTANCE'"
 * @generated
 */
public interface CertifyingDeath extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certifying DeathTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.1.7\')'"
	 * @generated
	 */
	boolean validateCertifyingDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certifying DeathClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\')'"
	 * @generated
	 */
	boolean validateCertifyingDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certifying DeathMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateCertifyingDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certifying DeathCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'69437-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\''"
	 * @generated
	 */
	boolean validateCertifyingDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certifying DeathEffectiveTime'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCertifyingDeathEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Certifying DeathCertificationPerformer'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))'"
	 * @generated
	 */
	boolean validateCertifyingDeathCertificationPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertifyingDeath init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CertifyingDeath init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CertifyingDeath
