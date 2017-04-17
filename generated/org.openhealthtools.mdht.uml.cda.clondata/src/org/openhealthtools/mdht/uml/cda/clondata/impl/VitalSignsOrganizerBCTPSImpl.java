/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.BodyHeight;
import org.openhealthtools.mdht.uml.cda.clondata.BodySurfaceArea;
import org.openhealthtools.mdht.uml.cda.clondata.BodyWeight;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.operations.VitalSignsOrganizerBCTPSOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.VitalSignsOrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Organizer BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VitalSignsOrganizerBCTPSImpl extends VitalSignsOrganizerImpl implements VitalSignsOrganizerBCTPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsOrganizerBCTPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getVitalSignsOrganizerBCTPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPSBodyHeight(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerBCTPSOperations.validateVitalSignsOrganizerBCTPSBodyHeight(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPSBodyWeight(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerBCTPSOperations.validateVitalSignsOrganizerBCTPSBodyWeight(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPSBodySurfaceArea(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VitalSignsOrganizerBCTPSOperations.validateVitalSignsOrganizerBCTPSBodySurfaceArea(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyHeight> getBodyHeights() {
		return VitalSignsOrganizerBCTPSOperations.getBodyHeights(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyWeight> getBodyWeights() {
		return VitalSignsOrganizerBCTPSOperations.getBodyWeights(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodySurfaceArea> getBodySurfaceAreas() {
		return VitalSignsOrganizerBCTPSOperations.getBodySurfaceAreas(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsOrganizerBCTPSOperations.validateVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizerBCTPS init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizerBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VitalSignsOrganizerBCTPSImpl
