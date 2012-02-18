/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteFluidSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note Fluid Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperativeNoteFluidSectionImpl extends SectionImpl implements OperativeNoteFluidSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteFluidSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE_FLUID_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteFluidSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteFluidSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteFluidSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteFluidSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteFluidSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} // OperativeNoteFluidSectionImpl
