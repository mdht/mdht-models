/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusOrganizer2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mental Status Organizer2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MentalStatusOrganizer2Impl extends CognitiveStatusResultOrganizerImpl implements MentalStatusOrganizer2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusOrganizer2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusOrganizer2HasCodeOrEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusOrganizer2Operations.validateMentalStatusOrganizer2HasCodeOrEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusOrganizer2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusOrganizer2Operations.validateMentalStatusOrganizer2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusOrganizer2CDCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusOrganizer2Operations.validateMentalStatusOrganizer2CDCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusObservation2> getConsolMentalStatusObservation2s() {
		return MentalStatusOrganizer2Operations.getConsolMentalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCognitiveStatusResultOrganizerCodeCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusOrganizer2Operations.validateCognitiveStatusResultOrganizerCodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusOrganizer2Operations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusOrganizer2Operations.validateResultOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusOrganizer2Operations.validateResultOrganizerResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalStatusOrganizer2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalStatusOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MentalStatusOrganizer2Impl
