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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection#validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo PHCR Treatment Information Section Strep Pneumo Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection#getStrepPneumoTherapeuticRegimenAct() <em>Get Strep Pneumo Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoPHCRTreatmentInformationSectionOperations extends PhcrTreatmentInformationSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoPHCRTreatmentInformationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo PHCR Treatment Information Section Strep Pneumo Therapeutic Regimen Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(streppneumo::StrepPneumoTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo PHCR Treatment Information Section Strep Pneumo Therapeutic Regimen Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(streppneumo::StrepPneumoTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param strepPneumoPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection strepPneumoPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION);
			try {
				VALIDATE_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPHCRTreatmentInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct"),
						 new Object [] { strepPneumoPHCRTreatmentInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection) <em>Get Strep Pneumo Therapeutic Regimen Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(streppneumo::StrepPneumoTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(streppneumo::StrepPneumoTherapeuticRegimenAct)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection) <em>Get Strep Pneumo Therapeutic Regimen Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(streppneumo::StrepPneumoTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(streppneumo::StrepPneumoTherapeuticRegimenAct)
	 * @param strepPneumoPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  StrepPneumoTherapeuticRegimenAct getStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection strepPneumoPHCRTreatmentInformationSection) {
		if (GET_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION, StrepPneumoPackage.Literals.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION.getEAllOperations().get(62));
			try {
				GET_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY);
		return (StrepPneumoTherapeuticRegimenAct) query.evaluate(strepPneumoPHCRTreatmentInformationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrTreatmentInformationSectionTemplateId(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.53')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrTreatmentInformationSectionTemplateId(StrepPneumoPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.53')
	 * @param strepPneumoPHCRTreatmentInformationSection The receiving '<em><b>PHCR Treatment Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrTreatmentInformationSectionTemplateId(StrepPneumoPHCRTreatmentInformationSection strepPneumoPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION);
			try {
				VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoPHCRTreatmentInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrTreatmentInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoPHCRTreatmentInformationSection, context) }),
						 new Object [] { strepPneumoPHCRTreatmentInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

} // StrepPneumoPHCRTreatmentInformationSectionOperations