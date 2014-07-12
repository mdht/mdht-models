/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedVitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection#validateHITSPVitalSignsSectionVitalSignEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Vital Sign Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection#validateHITSPVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionOperations extends CodedVitalSignsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPVitalSignsSectionVitalSignEntry(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Vital Sign Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPVitalSignsSectionVitalSignEntry(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ihe::VitalSignsOrganizer) and entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(hitsp::VitalSign)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPVitalSignsSectionVitalSignEntry(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Vital Sign Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPVitalSignsSectionVitalSignEntry(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHITSPVitalSignsSectionVitalSignEntry(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_VITAL_SIGN_ENTRY,
					HITSPPlugin.INSTANCE.getString("HITSPVitalSignsSectionVitalSignEntry"),
					new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.119')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Vital Signs Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHITSPVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("HITSPVitalSignsSectionTemplateId"),
					new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

} // VitalSignsSectionOperations
