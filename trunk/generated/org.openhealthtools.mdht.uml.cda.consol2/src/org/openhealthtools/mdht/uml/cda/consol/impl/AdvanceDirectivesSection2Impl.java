/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directives Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectivesSection2Impl extends AdvanceDirectivesSectionEntriesOptional2Impl implements
		AdvanceDirectivesSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectivesSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVES_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2HasAdvanceDirectiveObservation2XorAdvanceDirectiveOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection2NullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2NullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection2Entry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2Entry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2EntryAdvanceDirectiveOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSection2EntryAdvanceDirectiveObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectivesSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectivesSection2Operations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdvanceDirectiveObservation2> getConsolAdvanceDirectiveObservation2s() {
		return AdvanceDirectivesSection2Operations.getConsolAdvanceDirectiveObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AdvanceDirectiveOrganizer> getConsolAdvanceDirectiveOrganizers() {
		return AdvanceDirectivesSection2Operations.getConsolAdvanceDirectiveOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AdvanceDirectivesSection2Impl
