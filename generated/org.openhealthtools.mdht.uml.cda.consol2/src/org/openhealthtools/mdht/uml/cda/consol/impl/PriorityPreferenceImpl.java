/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.operations.PriorityPreferenceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Priority Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PriorityPreferenceImpl extends ObservationImpl implements PriorityPreference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRIORITY_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityPreferenceAuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PriorityPreferenceOperations.validatePriorityPreferenceAuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityPreference init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityPreference init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PriorityPreferenceImpl
