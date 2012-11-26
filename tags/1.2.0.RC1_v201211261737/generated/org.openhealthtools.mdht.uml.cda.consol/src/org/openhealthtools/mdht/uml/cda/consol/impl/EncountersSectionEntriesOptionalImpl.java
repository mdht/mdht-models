/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncountersSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounters Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncountersSectionEntriesOptionalImpl extends SectionImpl implements EncountersSectionEntriesOptional {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EncountersSectionEntriesOptionalImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEncountersSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEncountersSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEncountersSectionEntriesOptionalCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEncountersSectionEntriesOptionalTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalTitle(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEncountersSectionEntriesOptionalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalText(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEncountersSectionEntriesOptionalEncounterActivities(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionEntriesOptionalOperations.validateEncountersSectionEntriesOptionalEncounterActivities(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EList<EncounterActivities> getEncounterActivitiess() {
		return EncountersSectionEntriesOptionalOperations.getEncounterActivitiess(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EncountersSectionEntriesOptional init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionEntriesOptional init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EncountersSectionEntriesOptionalImpl
