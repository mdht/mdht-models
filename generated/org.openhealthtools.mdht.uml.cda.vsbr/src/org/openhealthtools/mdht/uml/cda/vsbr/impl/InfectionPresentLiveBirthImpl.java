/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfectionPresentLiveBirthOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infection Present Live Birth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfectionPresentLiveBirthImpl extends ObservationImpl implements InfectionPresentLiveBirth {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfectionPresentLiveBirthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.INFECTION_PRESENT_LIVE_BIRTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthCodeVS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfectionPresentLiveBirthValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfectionPresentLiveBirth init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfectionPresentLiveBirth init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InfectionPresentLiveBirthImpl
