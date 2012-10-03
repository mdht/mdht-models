/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognitive Status Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CognitiveStatusResultOrganizerImpl extends ResultOrganizerImpl implements CognitiveStatusResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveStatusResultOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerCodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerCodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusResultObservation> getCognitiveStatusResultObservations() {
		return CognitiveStatusResultOrganizerOperations.getCognitiveStatusResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusResultOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CognitiveStatusResultOrganizerImpl
