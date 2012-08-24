/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validatePhcrEncountersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validatePhcrEncountersSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validatePhcrEncountersSectionEncountersActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Encounters Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#getPHCREncountersActivities() <em>Get PHCR Encounters Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validateEncountersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhcrEncountersSectionOperations extends EncountersSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected PhcrEncountersSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrEncountersSectionTitle(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrEncountersSectionTitle(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Encounters')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrEncountersSectionTitle(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrEncountersSectionTitle(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param phcrEncountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrEncountersSectionTitle(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_ENCOUNTERS_SECTION);
      try
      {
        VALIDATE_PHCR_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrEncountersSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_ENCOUNTERS_SECTION__PHCR_ENCOUNTERS_SECTION_TITLE,
             PhcrPlugin.INSTANCE.getString("PhcrEncountersSectionTitle"),
             new Object [] { phcrEncountersSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrEncountersSectionText(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrEncountersSectionText(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrEncountersSectionText(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrEncountersSectionText(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param phcrEncountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrEncountersSectionText(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_ENCOUNTERS_SECTION);
      try
      {
        VALIDATE_PHCR_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrEncountersSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_ENCOUNTERS_SECTION__PHCR_ENCOUNTERS_SECTION_TEXT,
             PhcrPlugin.INSTANCE.getString("PhcrEncountersSectionText"),
             new Object [] { phcrEncountersSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrEncountersSectionEncountersActivity(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Encounters Activity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrEncountersSectionEncountersActivity(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(ccd::EncountersActivity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrEncountersSectionEncountersActivity(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Encounters Activity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrEncountersSectionEncountersActivity(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param phcrEncountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validatePhcrEncountersSectionEncountersActivity(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_ENCOUNTERS_SECTION);
      try
      {
        VALIDATE_PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrEncountersSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_ENCOUNTERS_SECTION__PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY,
             PhcrPlugin.INSTANCE.getString("PhcrEncountersSectionEncountersActivity"),
             new Object [] { phcrEncountersSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getPHCREncountersActivities(PhcrEncountersSection) <em>Get PHCR Encounters Activities</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPHCREncountersActivities(PhcrEncountersSection)
   * @generated
   * @ordered
   */
	protected static final String GET_PHCR_ENCOUNTERS_ACTIVITIES__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(ccd::EncountersActivity)).oclAsType(ccd::EncountersActivity)";

	/**
   * The cached OCL query for the '{@link #getPHCREncountersActivities(PhcrEncountersSection) <em>Get PHCR Encounters Activities</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPHCREncountersActivities(PhcrEncountersSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PHCR_ENCOUNTERS_ACTIVITIES__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  EList<EncountersActivity> getPHCREncountersActivities(PhcrEncountersSection phcrEncountersSection) {
    if (GET_PHCR_ENCOUNTERS_ACTIVITIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhcrPackage.Literals.PHCR_ENCOUNTERS_SECTION, PhcrPackage.Literals.PHCR_ENCOUNTERS_SECTION.getEAllOperations().get(64));
      try
      {
        GET_PHCR_ENCOUNTERS_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_PHCR_ENCOUNTERS_ACTIVITIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PHCR_ENCOUNTERS_ACTIVITIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<EncountersActivity> result = (Collection<EncountersActivity>) query.evaluate(phcrEncountersSection);
    return new BasicEList.UnmodifiableEList<EncountersActivity>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateEncountersSectionTemplateId(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEncountersSectionTemplateId(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.2')";

	/**
   * The cached OCL invariant for the '{@link #validateEncountersSectionTemplateId(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateEncountersSectionTemplateId(PhcrEncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param phcrEncountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateEncountersSectionTemplateId(PhcrEncountersSection phcrEncountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhcrPackage.Literals.PHCR_ENCOUNTERS_SECTION);
      try
      {
        VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrEncountersSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhcrValidator.DIAGNOSTIC_SOURCE,
             PhcrValidator.PHCR_ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EncountersSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrEncountersSection, context) }),
             new Object [] { phcrEncountersSection }));
      }
       
      return false;
    }
    return true;
  }

} // PhcrEncountersSectionOperations