/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSResponseSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Response Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSResponseSectionImpl extends SectionImpl implements EMSResponseSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSResponseSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_RESPONSE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionDelayOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionDelayOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionDispatchLocationOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionDispatchLocationOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionResponseOdometerReadingOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionResponseOdometerReadingOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSResponseSectionResponseModeToScene(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSResponseSectionOperations.validateEMSResponseSectionResponseModeToScene(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayOrganizer getDelayOrganizer() {
		return EMSResponseSectionOperations.getDelayOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationOrganizer getDispatchLocationOrganizer() {
		return EMSResponseSectionOperations.getDispatchLocationOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOdometerReadingOrganizer getResponseOdometerReadingOrganizer() {
		return EMSResponseSectionOperations.getResponseOdometerReadingOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModeToScene getResponseModeToScene() {
		return EMSResponseSectionOperations.getResponseModeToScene(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSResponseSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSResponseSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSResponseSectionImpl
