/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.operations;

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

import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicalEquipmentSectionOperations;

import org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer;
import org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#validateMedicalEquipmentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#validateMedicalEquipmentDeviceDefinitionOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Device Definition Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#getDeviceDefinitionOrganizers() <em>Get Device Definition Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#validateMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentOperations extends MedicalEquipmentSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicalEquipmentOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentText(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentText(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentText(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentText(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipment The receiving '<em><b>Medical Equipment</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateMedicalEquipmentText(MedicalEquipment medicalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.MEDICAL_EQUIPMENT);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipment))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.MEDICAL_EQUIPMENT__MEDICAL_EQUIPMENT_TEXT,
             PhmrPlugin.INSTANCE.getString("MedicalEquipmentText"),
             new Object [] { medicalEquipment }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentDeviceDefinitionOrganizer(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Device Definition Organizer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentDeviceDefinitionOrganizer(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(phmr::DeviceDefinitionOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentDeviceDefinitionOrganizer(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Device Definition Organizer</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentDeviceDefinitionOrganizer(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipment The receiving '<em><b>Medical Equipment</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateMedicalEquipmentDeviceDefinitionOrganizer(MedicalEquipment medicalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.MEDICAL_EQUIPMENT);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipment))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.MEDICAL_EQUIPMENT__MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER,
             PhmrPlugin.INSTANCE.getString("MedicalEquipmentDeviceDefinitionOrganizer"),
             new Object [] { medicalEquipment }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getDeviceDefinitionOrganizers(MedicalEquipment) <em>Get Device Definition Organizers</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceDefinitionOrganizers(MedicalEquipment)
   * @generated
   * @ordered
   */
	protected static final String GET_DEVICE_DEFINITION_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(phmr::DeviceDefinitionOrganizer)).oclAsType(phmr::DeviceDefinitionOrganizer)";

	/**
   * The cached OCL query for the '{@link #getDeviceDefinitionOrganizers(MedicalEquipment) <em>Get Device Definition Organizers</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDeviceDefinitionOrganizers(MedicalEquipment)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_DEVICE_DEFINITION_ORGANIZERS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  EList<DeviceDefinitionOrganizer> getDeviceDefinitionOrganizers(MedicalEquipment medicalEquipment) {
    if (GET_DEVICE_DEFINITION_ORGANIZERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(PhmrPackage.Literals.MEDICAL_EQUIPMENT, PhmrPackage.Literals.MEDICAL_EQUIPMENT.getEAllOperations().get(65));
      try
      {
        GET_DEVICE_DEFINITION_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_DEVICE_DEFINITION_ORGANIZERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DEVICE_DEFINITION_ORGANIZERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<DeviceDefinitionOrganizer> result = (Collection<DeviceDefinitionOrganizer>) query.evaluate(medicalEquipment);
    return new BasicEList.UnmodifiableEList<DeviceDefinitionOrganizer>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.9.1')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param medicalEquipment The receiving '<em><b>Medical Equipment</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateMedicalEquipmentSectionTemplateId(MedicalEquipment medicalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(PhmrPackage.Literals.MEDICAL_EQUIPMENT);
      try
      {
        VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipment))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             PhmrValidator.DIAGNOSTIC_SOURCE,
             PhmrValidator.MEDICAL_EQUIPMENT__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicalEquipmentSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicalEquipment, context) }),
             new Object [] { medicalEquipment }));
      }
       
      return false;
    }
    return true;
  }

} // MedicalEquipmentOperations