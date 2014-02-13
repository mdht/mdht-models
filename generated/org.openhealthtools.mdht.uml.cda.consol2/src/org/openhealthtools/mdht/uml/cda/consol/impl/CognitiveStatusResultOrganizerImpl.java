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
	public boolean validateResultOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateResultOrganizerClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateResultOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateResultOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateResultOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateResultOrganizerId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateResultOrganizerCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateResultOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateResultOrganizerStatusCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateResultOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations.validateResultOrganizerStatusCode(this, diagnostics, context);
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
