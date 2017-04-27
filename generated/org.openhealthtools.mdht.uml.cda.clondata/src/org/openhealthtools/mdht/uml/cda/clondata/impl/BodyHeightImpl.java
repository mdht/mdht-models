/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.BodyHeight;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BodyHeightOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Height</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BodyHeightImpl extends VitalSignObservationImpl implements BodyHeight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyHeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBodyHeight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeightCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyHeightOperations.validateBodyHeightCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeightCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyHeightOperations.validateBodyHeightCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeightValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyHeightOperations.validateBodyHeightValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodyHeightOperations.validateVitalSignObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyHeight init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyHeight init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BodyHeightImpl
