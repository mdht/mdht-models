/*******************************************************************************
 * Copyright (c) 2010, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.pilot.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;
import org.openhealthtools.mdht.uml.cda.pilot.operations.TuberculosisFollowUpProgressNoteOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuberculosis Follow Up Progress Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisFollowUpProgressNoteImpl extends ClinicalDocumentImpl implements
		TuberculosisFollowUpProgressNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisFollowUpProgressNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TBPNPackage.Literals.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNotePatientNames(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TuberculosisFollowUpProgressNoteOperations.validateTuberculosisFollowUpProgressNotePatientNames(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNoteTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TuberculosisFollowUpProgressNoteOperations.validateTuberculosisFollowUpProgressNoteTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisFollowUpProgressNoteTbResultsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TuberculosisFollowUpProgressNoteOperations.validateTuberculosisFollowUpProgressNoteTbResultsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultsSection getTbResultsSection() {
		return TuberculosisFollowUpProgressNoteOperations.getTbResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisFollowUpProgressNote init() {
		CDAUtil.init(this);
		return this;
	}
} // TuberculosisFollowUpProgressNoteImpl
