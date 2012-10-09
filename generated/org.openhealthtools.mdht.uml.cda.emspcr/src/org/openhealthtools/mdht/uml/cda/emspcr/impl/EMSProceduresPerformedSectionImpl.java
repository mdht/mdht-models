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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSProceduresPerformedSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Procedures Performed Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSProceduresPerformedSectionImpl extends SectionImpl implements EMSProceduresPerformedSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSProceduresPerformedSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_PROCEDURES_PERFORMED_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProceduresPerformedSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProceduresPerformedSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProceduresPerformedSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProceduresPerformedSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProceduresPerformedSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSProceduresPerformedSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSProceduresPerformedSectionOperations.validateEMSProceduresPerformedSectionEntry1(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProceduresPerformedSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProceduresPerformedSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSProceduresPerformedSectionImpl
