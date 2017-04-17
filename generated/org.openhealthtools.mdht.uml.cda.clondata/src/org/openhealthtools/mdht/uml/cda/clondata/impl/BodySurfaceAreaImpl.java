/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.BodySurfaceArea;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.operations.BodySurfaceAreaOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Surface Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BodySurfaceAreaImpl extends VitalSignObservationImpl implements BodySurfaceArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodySurfaceAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getBodySurfaceArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceAreaCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySurfaceAreaOperations.validateBodySurfaceAreaCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceAreaCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySurfaceAreaOperations.validateBodySurfaceAreaCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceAreaValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySurfaceAreaOperations.validateBodySurfaceAreaValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BodySurfaceAreaOperations.validateVitalSignObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySurfaceArea init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySurfaceArea init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // BodySurfaceAreaImpl
