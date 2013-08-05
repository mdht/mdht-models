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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.impl.ProcedureDescriptionSectionImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;
import org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProceduresPerformedSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedures Performed Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProceduresPerformedSectionImpl extends ProcedureDescriptionSectionImpl implements
		ProceduresPerformedSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresPerformedSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURES_PERFORMED_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresPerformedSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresPerformedSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresPerformedSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresPerformedSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresPerformedSectionProcedureActivityProcedure1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresPerformedSectionOperations.validateProceduresPerformedSectionProcedureActivityProcedure1(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedureActivityProcedure1s() {
		return ProceduresPerformedSectionOperations.getProcedureActivityProcedure1s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureDescriptionSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresPerformedSectionOperations.validateProcedureDescriptionSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresPerformedSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresPerformedSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProceduresPerformedSectionImpl
