/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SubstanceAdministrationImpl;
import org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.AnthracyclinesLifetimeDoseOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anthracyclines Lifetime Dose</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnthracyclinesLifetimeDoseImpl extends SubstanceAdministrationImpl implements AnthracyclinesLifetimeDose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnthracyclinesLifetimeDoseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getAnthracyclinesLifetimeDose();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDoseTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnthracyclinesLifetimeDoseOperations.validateAnthracyclinesLifetimeDoseTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDoseClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnthracyclinesLifetimeDoseOperations.validateAnthracyclinesLifetimeDoseClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDoseDoseQuantity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnthracyclinesLifetimeDoseOperations.validateAnthracyclinesLifetimeDoseDoseQuantity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDoseEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnthracyclinesLifetimeDoseOperations.validateAnthracyclinesLifetimeDoseEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDoseMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnthracyclinesLifetimeDoseOperations.validateAnthracyclinesLifetimeDoseMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDoseStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnthracyclinesLifetimeDoseOperations.validateAnthracyclinesLifetimeDoseStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDoseConsumable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AnthracyclinesLifetimeDoseOperations.validateAnthracyclinesLifetimeDoseConsumable(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthracyclinesLifetimeDose init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthracyclinesLifetimeDose init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AnthracyclinesLifetimeDoseImpl
