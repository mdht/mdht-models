/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AdvanceDirectiveOrganizerImpl extends OrganizerImpl implements AdvanceDirectiveOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveOrganizerStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveOrganizerAdvanceDirectiveObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerAdvanceDirectiveObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveOrganizerAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOrganizerOperations.validateAdvanceDirectiveOrganizerAuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdvanceDirectiveObservation2> getAdvanceDirectiveObservation2s() {
		return AdvanceDirectiveOrganizerOperations.getAdvanceDirectiveObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdvanceDirectiveOrganizerImpl
