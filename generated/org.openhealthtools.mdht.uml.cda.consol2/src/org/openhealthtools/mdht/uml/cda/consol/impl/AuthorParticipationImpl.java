/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.AuthorImpl;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.AuthorParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author Participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AuthorParticipationImpl extends AuthorImpl implements AuthorParticipation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorParticipationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.AUTHOR_PARTICIPATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorAssignedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorAssignedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorParticipationAssignedAuthorCodeTerminology(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorCodeTerminology(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAuthorParticipationAssignedAuthorRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AuthorParticipationOperations.validateAuthorParticipationAssignedAuthorRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorParticipation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorParticipation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AuthorParticipationImpl
