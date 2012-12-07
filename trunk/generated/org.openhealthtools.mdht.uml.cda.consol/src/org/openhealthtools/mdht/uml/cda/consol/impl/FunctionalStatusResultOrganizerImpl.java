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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusResultOrganizerImpl extends ResultOrganizerImpl implements FunctionalStatusResultOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected FunctionalStatusResultOrganizerImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_RESULT_ORGANIZER;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerCodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerCodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerStatusCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerStatusCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateFunctionalStatusResultOrganizerFunctionalStatusResultObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerFunctionalStatusResultObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<FunctionalStatusResultObservation> getFunctionalStatusResultObservations() {
		return FunctionalStatusResultOrganizerOperations.getFunctionalStatusResultObservations(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	public FunctionalStatusResultOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusResultOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FunctionalStatusResultOrganizerImpl
