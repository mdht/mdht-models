/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.AuthorImpl;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProvenanceAuthorParticipation;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProvenanceAuthorParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provenance Author Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProvenanceAuthorParticipationImpl extends AuthorImpl implements ProvenanceAuthorParticipation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvenanceAuthorParticipationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROVENANCE_AUTHOR_PARTICIPATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationAssignedAuthor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNFamily(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonPNGiven(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProvenanceAuthorParticipationOperations.validateProvenanceAuthorParticipationProvenanceAssignedAuthorAssignedAuthoringDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAuthorParticipation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvenanceAuthorParticipation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProvenanceAuthorParticipationImpl
