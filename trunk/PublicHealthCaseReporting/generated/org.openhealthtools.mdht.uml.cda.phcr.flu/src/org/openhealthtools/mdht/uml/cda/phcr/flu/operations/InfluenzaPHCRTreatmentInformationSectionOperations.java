/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.flu.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.flu.FluPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection#validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Treatment Information Section Influenza Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection#getInfluenzaTherapeuticRegimenAct() <em>Get Influenza Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaPHCRTreatmentInformationSectionOperations extends PhcrTreatmentInformationSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPHCRTreatmentInformationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Treatment Information Section Influenza Therapeutic Regimen Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza PHCR Treatment Information Section Influenza Therapeutic Regimen Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param influenzaPHCRTreatmentInformationSection The receiving '<em><b>Influenza PHCR Treatment Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection influenzaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION);
			try {
				VALIDATE_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRTreatmentInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT,
						 FluPlugin.INSTANCE.getString("InfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct"),
						 new Object [] { influenzaPHCRTreatmentInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection) <em>Get Influenza Therapeutic Regimen Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct))->asSequence()->first().oclAsType(flu::InfluenzaTherapeuticRegimenAct)";

	/**
	 * The cached OCL query for the '{@link #getInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection) <em>Get Influenza Therapeutic Regimen Act</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(flu::InfluenzaTherapeuticRegimenAct))->asSequence()->first().oclAsType(flu::InfluenzaTherapeuticRegimenAct)
	 * @param influenzaPHCRTreatmentInformationSection The receiving '<em><b>Influenza PHCR Treatment Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  InfluenzaTherapeuticRegimenAct getInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection influenzaPHCRTreatmentInformationSection) {
		if (GET_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(fluPackage.Literals.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION, fluPackage.Literals.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION.getEAllOperations().get(63));
			try {
				GET_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY = helper.createQuery(GET_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFLUENZA_THERAPEUTIC_REGIMEN_ACT__EOCL_QRY);
		return (InfluenzaTherapeuticRegimenAct) query.evaluate(influenzaPHCRTreatmentInformationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrTreatmentInformationSectionTemplateId(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.48')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrTreatmentInformationSectionTemplateId(InfluenzaPHCRTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.48')
	 * @param influenzaPHCRTreatmentInformationSection The receiving '<em><b>Influenza PHCR Treatment Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrTreatmentInformationSectionTemplateId(InfluenzaPHCRTreatmentInformationSection influenzaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION);
			try {
				VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPHCRTreatmentInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrTreatmentInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(influenzaPHCRTreatmentInformationSection, context) }),
						 new Object [] { influenzaPHCRTreatmentInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaPHCRTreatmentInformationSectionOperations