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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispositionSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Disposition Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSDispositionSectionImpl extends SectionImpl implements EMSDispositionSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSDispositionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_DISPOSITION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry3(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry5(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry7(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry6(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSDispositionSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry4(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSDispositionSectionImpl
