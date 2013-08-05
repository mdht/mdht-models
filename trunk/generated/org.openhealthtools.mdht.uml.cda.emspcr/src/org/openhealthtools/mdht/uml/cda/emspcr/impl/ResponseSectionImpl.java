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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResponseSectionImpl extends SectionImpl implements ResponseSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.RESPONSE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionDelayOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionDelayOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionDispatchLocationOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionDispatchLocationOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionResponseOdometerReadingOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionResponseOdometerReadingOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseSectionResponseModeToScene(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResponseSectionOperations.validateResponseSectionResponseModeToScene(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayOrganizer getDelayOrganizer() {
		return ResponseSectionOperations.getDelayOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationOrganizer getDispatchLocationOrganizer() {
		return ResponseSectionOperations.getDispatchLocationOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOdometerReadingOrganizer getResponseOdometerReadingOrganizer() {
		return ResponseSectionOperations.getResponseOdometerReadingOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModeToScene getResponseModeToScene() {
		return ResponseSectionOperations.getResponseModeToScene(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ResponseSectionImpl
