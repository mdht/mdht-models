/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection#validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Clinical Information Section Chlamydiatrachomatis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection#getChlamydiatrachomatisCaseObservation() <em>Get Chlamydiatrachomatis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisPHCRClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChlamydiatrachomatisPHCRClinicalInformationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Clinical Information Section Chlamydiatrachomatis Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Clinical Information Section Chlamydiatrachomatis Case Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param chlamydiatrachomatisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection chlamydiatrachomatisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPHCRClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION,
						 ChlamydiatrachomatisPlugin.INSTANCE.getString("ChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation"),
						 new Object [] { chlamydiatrachomatisPHCRClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection) <em>Get Chlamydiatrachomatis Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisCaseObservation))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisCaseObservation)";

	/**
	 * The cached OCL query for the '{@link #getChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection) <em>Get Chlamydiatrachomatis Case Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(chlamydiatrachomatis::ChlamydiatrachomatisCaseObservation))->asSequence()->first().oclAsType(chlamydiatrachomatis::ChlamydiatrachomatisCaseObservation)
	 * @param chlamydiatrachomatisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  ChlamydiatrachomatisCaseObservation getChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection chlamydiatrachomatisPHCRClinicalInformationSection) {
		if (GET_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION, ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(69));
			try {
				GET_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__EOCL_QRY);
		return (ChlamydiatrachomatisCaseObservation) query.evaluate(chlamydiatrachomatisPHCRClinicalInformationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.39')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(ChlamydiatrachomatisPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.39')
	 * @param chlamydiatrachomatisPHCRClinicalInformationSection The receiving '<em><b>PHCR Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(ChlamydiatrachomatisPHCRClinicalInformationSection chlamydiatrachomatisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisPHCRClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
						 ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisPHCRClinicalInformationSection, context) }),
						 new Object [] { chlamydiatrachomatisPHCRClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

} // ChlamydiatrachomatisPHCRClinicalInformationSectionOperations