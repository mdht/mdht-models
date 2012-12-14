/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounter Activities</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities#validateMu2consolEncounterActivitiesCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Encounter Activities Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterActivitiesOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivitiesOperations {
	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	protected EncounterActivitiesOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMu2consolEncounterActivitiesCodeValue(EncounterActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Encounter Activities Code Value</em>}' operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateMu2consolEncounterActivitiesCodeValue(EncounterActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.codeSystem = '2.16.840.1.113883.6.3' xor self.code.codeSystem = '2.16.840.1.113883.6.96'";

	/**
   * The cached OCL invariant for the '{@link #validateMu2consolEncounterActivitiesCodeValue(EncounterActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Encounter Activities Code Value</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateMu2consolEncounterActivitiesCodeValue(EncounterActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.code.codeSystem = '2.16.840.1.113883.6.3' xor self.code.codeSystem =
	 * '2.16.840.1.113883.6.96'
	 * 
	 * @param encounterActivities
	 *            The receiving '<em><b>Encounter Activities</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolEncounterActivitiesCodeValue(
			EncounterActivities encounterActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.ENCOUNTER_ACTIVITIES);
      try
      {
        VALIDATE_MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterActivities))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.ENCOUNTER_ACTIVITIES__MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE,
             Mu2consolPlugin.INSTANCE.getString("Mu2consolEncounterActivitiesCodeValue"),
             new Object [] { encounterActivities }));
      }
       
      return false;
    }
    return true;
  }

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateEncounterActivitiesTemplateId(EncounterActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Encounter Activities Template Id</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateEncounterActivitiesTemplateId(EncounterActivities,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.49')";

	/**
   * The cached OCL invariant for the '{@link #validateEncounterActivitiesTemplateId(EncounterActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}' invariant operation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #validateEncounterActivitiesTemplateId(EncounterActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.4.49')
	 * 
	 * @param encounterActivities
	 *            The receiving '<em><b>Encounter Activities</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateEncounterActivitiesTemplateId(
			EncounterActivities encounterActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(Mu2consolPackage.Literals.ENCOUNTER_ACTIVITIES);
      try
      {
        VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounterActivities))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Mu2consolValidator.DIAGNOSTIC_SOURCE,
             Mu2consolValidator.ENCOUNTER_ACTIVITIES__ENCOUNTER_ACTIVITIES_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "EncounterActivitiesTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(encounterActivities, context) }),
             new Object [] { encounterActivities }));
      }
       
      return false;
    }
    return true;
  }

} // EncounterActivitiesOperations