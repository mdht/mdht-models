/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic;
import org.openhealthtools.mdht.uml.cda.consol.operations.WoundCharacteristicOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wound Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WoundCharacteristicImpl extends ObservationImpl implements WoundCharacteristic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WoundCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.WOUND_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWoundCharacteristicValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return WoundCharacteristicOperations.validateWoundCharacteristicValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WoundCharacteristic init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WoundCharacteristic init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // WoundCharacteristicImpl
