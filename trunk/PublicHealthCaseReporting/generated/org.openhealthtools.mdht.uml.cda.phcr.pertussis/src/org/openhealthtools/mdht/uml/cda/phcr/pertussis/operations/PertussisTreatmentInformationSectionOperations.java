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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection#validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Treatment Information Section Pertussis Therapeutic Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection#getPertussisTherapeuticRegimen() <em>Get Pertussis Therapeutic Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisTreatmentInformationSectionOperations extends PhcrTreatmentInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PertussisTreatmentInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Treatment Information Section Pertussis Therapeutic Regimen</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(pertussis::PertussisTherapeuticRegimenAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Treatment Information Section Pertussis Therapeutic Regimen</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisTreatmentInformationSection The receiving '<em><b>Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(PertussisTreatmentInformationSection pertussisTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_TREATMENT_INFORMATION_SECTION__PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN,
             PertussisPlugin.INSTANCE.getString("PertussisTreatmentInformationSectionPertussisTherapeuticRegimen"),
             new Object [] { pertussisTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getPertussisTherapeuticRegimen(PertussisTreatmentInformationSection) <em>Get Pertussis Therapeutic Regimen</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisTherapeuticRegimen(PertussisTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_PERTUSSIS_THERAPEUTIC_REGIMEN__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(pertussis::PertussisTherapeuticRegimenAct))->asSequence()->any(true).oclAsType(pertussis::PertussisTherapeuticRegimenAct)";

	/**
   * The cached OCL query for the '{@link #getPertussisTherapeuticRegimen(PertussisTreatmentInformationSection) <em>Get Pertussis Therapeutic Regimen</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPertussisTherapeuticRegimen(PertussisTreatmentInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_THERAPEUTIC_REGIMEN__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  PertussisTherapeuticRegimenAct getPertussisTherapeuticRegimen(PertussisTreatmentInformationSection pertussisTreatmentInformationSection) {
    if (GET_PERTUSSIS_THERAPEUTIC_REGIMEN__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_TREATMENT_INFORMATION_SECTION, PertussisPackage.Literals.PERTUSSIS_TREATMENT_INFORMATION_SECTION.getEAllOperations().get(63));
      try
      {
        GET_PERTUSSIS_THERAPEUTIC_REGIMEN__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_THERAPEUTIC_REGIMEN__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_THERAPEUTIC_REGIMEN__EOCL_QRY);
    return (PertussisTherapeuticRegimenAct) query.evaluate(pertussisTreatmentInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.26')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrTreatmentInformationSectionTemplateId(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrTreatmentInformationSectionTemplateId(PertussisTreatmentInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param pertussisTreatmentInformationSection The receiving '<em><b>Treatment Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrTreatmentInformationSectionTemplateId(PertussisTreatmentInformationSection pertussisTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PertussisPackage.Literals.PERTUSSIS_TREATMENT_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisTreatmentInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PertussisValidator.DIAGNOSTIC_SOURCE,
             PertussisValidator.PERTUSSIS_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrTreatmentInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisTreatmentInformationSection, context) }),
             new Object [] { pertussisTreatmentInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // PertussisTreatmentInformationSectionOperations