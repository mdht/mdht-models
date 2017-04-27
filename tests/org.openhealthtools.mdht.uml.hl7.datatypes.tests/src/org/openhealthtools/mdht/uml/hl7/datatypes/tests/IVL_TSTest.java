/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.operations.IVL_TSOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>IVL TS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS#validateOptionsContainingWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IVL_TSTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOptionsContainingLow() {
		OperationsTestCase<IVL_TS> validateOptionsContainingLowTestCase = new OperationsTestCase<IVL_TS>(
			"validateOptionsContainingLow",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
					}
				});

			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_TSOperations.validateOptionsContainingLow((IVL_TS) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOptionsContainingCenter() {
		OperationsTestCase<IVL_TS> validateOptionsContainingCenterTestCase = new OperationsTestCase<IVL_TS>(
			"validateOptionsContainingCenter",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {

						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});

			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_TSOperations.validateOptionsContainingCenter((IVL_TS) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingCenterTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOptionsContainingHigh() {
		OperationsTestCase<IVL_TS> validateOptionsContainingHighTestCase = new OperationsTestCase<IVL_TS>(
			"validateOptionsContainingHigh",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 *
			 * not self.high.oclIsUndefined() implies
			 * (self.low.oclIsUndefined() and self.center.oclIsUndefined() and self.width.oclIsUndefined()) or
			 * ((not self.low.oclIsUndefined()) and self.width.oclIsUndefined() and self.center.oclIsUndefined()) or
			 * ((not self.width.oclIsUndefined()) and self.low.oclIsUndefined() and self.center.oclIsUndefined())
			 *
			 *
			 * Fail States
			 * high and
			 * l c w
			 * X X X
			 * X X -
			 * X - X
			 * - X X
			 * - X -
			 *
			 * Pass States
			 * high and
			 * l c w
			 * - - -
			 * x - -
			 * - -x
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_TSOperations.validateOptionsContainingHigh((IVL_TS) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOptionsContainingWidth() {
		OperationsTestCase<IVL_TS> validateOptionsContainingWidthTestCase = new OperationsTestCase<IVL_TS>(
			"validateOptionsContainingWidth",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_TS target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_TS target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_TSOperations.validateOptionsContainingWidth((IVL_TS) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IVL_TSOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<IVL_TS> {

		public IVL_TS create() {
			return DatatypesFactory.eINSTANCE.createIVL_TS();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends IVL_TSOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // IVL_TSOperations
